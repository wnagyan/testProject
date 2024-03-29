package flowyun;

import com.flowyun.reactor.MySubscriber;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ReactorTest {

    @Test
    public void testCreate(){
        // 1.just（）：可以指定序列中包含的全部元素，创建出来的Flux序列会在发布这些元素之后自动结束
        Flux<String> f1 = Flux.just("str1", "str2", "str3");
        // 这里若输入俩参数，则会报错,Mono是一个或者空序列
        Mono<Integer> m1 = Mono.just(1);

        // 2.fromIterable()从一个Iterable对象中创建一个Flux对象
        Flux<Integer> f2 = Flux.fromIterable(Arrays.asList(1, 2, 3, 4, 5));

        // 3.fromStream()从一个Stream对象中创建一个Flux对象
        ArrayList<Integer> numList = new ArrayList();
        numList.add(1);
        Flux<Integer> f3 = Flux.fromStream(numList.stream());

        // 4.fromArray()从一个数组对象中创建一个Flux对象
        Integer[] arr = new Integer[]{1,2,3};
        Flux<Integer> f4 = Flux.fromArray(arr);

        // 5.range（start，count） 表示从start开始，递增的生成count个数字，都是int类型的参数
        Flux<Integer> f5 = Flux.range(1, 10);

        // 6.创建一个不包含任何元素，只发布结束消息的序列。
        // 并且这种方式不会进行后续传递，需要switchIfEmpty（）方法来进行处理。
        // 因为响应式编程中，流的处理是基于元素的，而empty（）是没有元素的！
        Flux<Object> empty = Flux.empty();

        // 7.创建一个只包含错误消息的序列，里面的参数类型是Throwable
        Flux<Object> error = Flux.error(new Exception("error"));

        // 8.创建一个不包含任何消息通知的序列，注意区别empty()，empty还是会发布结束消息的。
        Flux<Object> never = Flux.never();

    }

    @Test
    public void testOut(){
        Flux<String> stringFlux = Flux.just("str1", "str2", "str3");
        stringFlux.subscribe(System.out::println);
    }

    @Test
    public void testSubscriber(){
        Flux<Integer> flux = Flux.range(1, 6).map(item -> {
            if (item <= 4){
                return item * 2;
            }
            throw new RuntimeException("数据超过了5！");
        });

        MySubscriber mySubscriber = new MySubscriber();
        flux.subscribe(System.out::println, System.out::println, () -> System.out.println("已完成"), s -> mySubscriber.request(2));
        flux.subscribe(mySubscriber);
    }

    @Test
    public void mapTest() {
        List<String> request = Arrays.asList("abc", "abcd", "klg", "klgh", "wold");

        Mono.just(request)
                .flatMapMany(this::getContext)
                .subscribe(System.out::println);

    }

    private Flux<Context> getContext(List<String> list){
        // 模拟sink 创建出独立的flux对象，
        Flux<Context> stringFlux = Flux.create(sink -> {
            for (String string : list) {
                sink.next(new Context(string,0));
            }
            sink.complete();
        });

        stringFlux.subscribe(System.out::println);
        return stringFlux;
    }

    @Data
    @AllArgsConstructor
    class Context{
        String data;
        int status;
    }

    @Test
    public void bufferTest(){
//        Flux.range(1, 100).buffer(20).subscribe(System.out::println);
//        Flux.interval(Duration.ofMillis(100)).buffer(1001).take(2).toStream().forEach(System.out::println);
        Flux.range(1, 10).bufferUntil(i -> i%2 == 0).subscribe(System.out::println);
//        Flux.range(1, 10).bufferWhile(i -> i%2 == 0).subscribe(System.out::println);
    }

    @Test
    public void filterTest(){
        Flux.range(1, 10).filter(i -> i%2 == 0).subscribe(System.out::println);
    }

    @Test
    public void zipWithTest(){
        Flux.just("a", "b").zipWith(Flux.just("c", "d")).subscribe(System.out::println);
        Flux.just("a", "b").zipWith(Flux.just("c", "d"), (s1, s2) -> String.format("%s-%s", s1, s2)).subscribe(System.out::println);
    }

    @Test
    public void takeTest(){
//        Flux.range(1, 1000).take(10).subscribe(System.out::println);
//        Flux.range(1, 1000).takeLast(10).subscribe(System.out::println);
//        Flux.range(1, 1000).takeWhile(i -> i < 10).subscribe(System.out::println);
        Flux.range(1, 1000).takeUntil(i -> i == 10).subscribe(System.out::println);
    }

    @Test
    public void reduceTest(){
        Flux.range(2, 3).reduce((x, y) -> x + y).subscribe(System.out::println);
//        Flux.range(1, 100).reduceWith(() -> 100, (x + y) -> x + y).subscribe(System.out::println);
    }


}
