package com.flowyun.reactor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FluxTest {

    public static void main(String[] args) {
//        String ex = "PerformanceManager[第1个中括号]Product[第2个中括号]<[第3个中括号]79";
        String ex = "com.flowyun.dae.common.em.exception.base.BusinessException: [406004]:维度日期组件类型有且只能有1个时才可使用同比/环比";
        Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(ex);
        System.out.println(matcher.find());
        System.out.println(matcher.group(1));
    }
}
