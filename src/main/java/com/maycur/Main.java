package com.maycur;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<String> list = new ArrayList<>();
//        list.add("abc");
//        list.add("bcd");
//        list.add("345");
//        list.add("456");
//        try {
//            String s = objectMapper.writeValueAsString(null);
//            System.out.println(s);
////            List<String> list1 = objectMapper.readValue(s, List.class);
////            System.out.println(list1);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }

        System.out.println(fmtMicrometer("12345"));;


    }

    public static String fmtMicrometer(String text) {
        DecimalFormat df = null;
        if (text.indexOf(".") > 0) {
            if (text.length() - text.indexOf(".") - 1 == 0) {
                df = new DecimalFormat("###,##0.");
            } else if (text.length() - text.indexOf(".") - 1 == 1) {
                df = new DecimalFormat("###,##0.0");
            } else {
                df = new DecimalFormat("###,##0.00");
            }
        } else {
            df = new DecimalFormat("###,##0");
        }
        double number = 0.0;
        try {
            number = Double.parseDouble(text);
        } catch (Exception e) {
            number = 0.0;
        }
        return df.format(number);
    }
}
