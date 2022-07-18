package com.maycur;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[] s = new String[2];
        s[0] = "123456;123458";
        s[1] = "123457";

        String str = "987654;987653";

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("s", s);
        dataMap.put("str", str);

        List<Long> fileIds = new ArrayList<>();

        for (String key : dataMap.keySet()){
            Object o = dataMap.get(key);
            if (o instanceof String){
                String[] split = String.valueOf(o).split(";");
                fileIds = List.of(split).stream().map(Long::valueOf).collect(Collectors.toList());
            }else if (o instanceof String[]){
                String[] strings = (String[]) o;
                for (String ss : strings){
                    String[] split = String.valueOf(ss).split(";");
                    fileIds.addAll(List.of(split).stream().map(Long::valueOf).collect(Collectors.toList()));
                };
            }
        }
        fileIds.forEach(System.out::println);
    }


}
