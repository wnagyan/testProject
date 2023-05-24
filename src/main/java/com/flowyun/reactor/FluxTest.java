package com.flowyun.reactor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FluxTest {

    public static void main(String[] args) {
        Flux.range(1, 10).map(item -> {
            return item % 2 == 0 ? item * 2 : item;
        }).subscribe(item -> {
            System.out.print(item + " ");
        }, info -> {
            System.out.println("异常");
        }, () -> {
            System.out.println("完成");
        });
    }
}
