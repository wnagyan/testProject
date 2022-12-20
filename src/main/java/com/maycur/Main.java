package com.maycur;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonObject;
import lombok.*;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.logging.stdout.StdOutImpl;

import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        int[] num = new int[]{2,3,5,3,3,2,5};
        int result = num[0];
        for (int i : num){
            result ^= i;
        }
        System.out.println(result);
    }

    @Data
    @AllArgsConstructor
    static class Employee{
        private String name;
        private Integer age;
    }

}
