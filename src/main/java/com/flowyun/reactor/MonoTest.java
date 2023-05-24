package com.flowyun.reactor;

import com.test.Employee;
import reactor.core.publisher.Mono;

public class MonoTest {

    public static void main(String[] args) {
        Mono.just(new Employee()).subscribe(System.out::print);
    }

}
