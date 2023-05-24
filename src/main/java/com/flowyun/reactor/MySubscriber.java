package com.flowyun.reactor;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.util.concurrent.TimeUnit;

public class MySubscriber extends BaseSubscriber {

    @Override
    protected void hookOnNext(Object value) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Get value [" + value + "]");
        // 每次处理完后再去请求1个元素
        request(1);
    }

    @Override
    protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscribed and make a request...");
        // 订阅时首先向上游请求1个元素
        request(1);
    }
}
