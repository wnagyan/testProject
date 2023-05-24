package flowyun;

import com.flowyun.reactor.EventSource;
import com.flowyun.reactor.MyListener;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Schedulers;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Test3 {
    private final int EVENT_DURATION = 10;    // 生成的事件间隔时间，单位毫秒
    private final int EVENT_COUNT = 10;    // 生成的事件个数
    private final int PROCESS_DURATION = 30;    // 订阅者处理每个元素的时间，单位毫秒

    // 一个事件源，用于创建多个事件，我们用上面的两个参数控制了事件创建的频率
    // 通过Flux.create来转换成一个个Flux数据流。
    private Flux<EventSource.Event> fastPublisher;
    // 慢的订阅者，会继承BaseSubscriber，重写对应的方法
    private SlowSubscriber slowSubscriber;
    private EventSource eventSource;
    private CountDownLatch countDownLatch;

    private Flux<EventSource.Event> createFlux(FluxSink.OverflowStrategy strategy) {
        // 事件源注册了一个监听器，负责监听新事件的创建以及事件源的停止
        return Flux.create(sink -> eventSource.register(new MyListener() {
            @Override
            public void newEvent(EventSource.Event event) {
                System.out.println("上游------>数据源创建了新事件：" + event.getMsg());
                sink.next(event);
            }

            @Override
            public void eventSourceStopped() {
                sink.complete();
            }
        }), strategy); // 别忘了这里还有个背压策略的参数
    }

    // 用来往数据源中添加事件用的，并通过定义的变量来控制频率，但是依旧发布的很快
    private void generateEvent(int times, int millis) {
        // 循环生成MyEvent，每个MyEvent间隔millis毫秒
        for (int i = 0; i < times; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(millis);
            } catch (InterruptedException e) {
            }
            eventSource.newEvent(new EventSource.Event(new Date(), "Event-" + i));
        }
        eventSource.eventStopped();
    }


    // 进行一些初始化操作
    @Before
    public void setup() {
        countDownLatch = new CountDownLatch(1);
        slowSubscriber = new SlowSubscriber();
        eventSource = new EventSource();
    }

    /**
     * 触发订阅，使用CountDownLatch等待订阅者处理完成。
     */
    @After
    public void subscribe() throws InterruptedException {
        // 也就是Flux.subscribe(subscriber)
        fastPublisher.subscribe(slowSubscriber);
        // 创建数据源
        generateEvent(EVENT_COUNT, EVENT_DURATION);
        countDownLatch.await(1, TimeUnit.MINUTES);
    }


    @Test
    public void testCreateBackPressureStratety() {
        fastPublisher =
                createFlux(FluxSink.OverflowStrategy.LATEST)
                        // 请求发生的时候，打印内容
                        .doOnRequest(n -> System.out.println("下游------>向上游请求" + n + "个数据"))
                        // 将任务运行于一个单线程上，并且指定订阅者每次向上游request的个数。默认是256
                        // 因为一般情况下，create是一个多线程的方法，发布者和订阅者不在同一个线程上
                        .publishOn(Schedulers.newSingle("newSingle"), 1);
    }


    class SlowSubscriber extends BaseSubscriber<EventSource.Event> {

        @Override
        protected void hookOnSubscribe(Subscription subscription) {
            request(10);
        }

        @Override
        protected void hookOnNext(EventSource.Event event) {
            System.out.println("线程" + Thread.currentThread().getName() + "接收数据:" + event.getMsg());
            try {
                TimeUnit.MILLISECONDS.sleep(PROCESS_DURATION);
            } catch (InterruptedException e) {
            }
            // 每处理完1个数据，就再请求1个
            request(10);
        }

        @Override
        protected void hookOnComplete() {
            countDownLatch.countDown();
        }
    }
}
