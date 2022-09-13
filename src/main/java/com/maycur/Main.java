package com.maycur;

import org.apache.ibatis.annotations.Param;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set = Collections.emptySet();
        set.add("abc");
        set.stream().forEach(path -> {
            path = path.concat("123");
        });
        set.forEach(System.out::println);
    }
}
