package com.maycur.leetcode.easy.algorithm.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * 1534. 统计好三元组
 *
 * @topic 给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
 *
 * 如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
 *
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * 其中 |x| 表示 x 的绝对值。
 * 返回 好三元组的数量 。
 *
 * 链接：https://leetcode.cn/problems/count-good-triplets
 */
public class Q1534 {

    public static void main(String[] args) {
//        String curDate = "2022-12-01";
//        String preDate = "";
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate localDateTime = LocalDate.parse(curDate, dateTimeFormatter);
//        preDate = dateTimeFormatter.format(localDateTime.plusMonths(-1));
//        System.out.println(preDate);

        System.out.println(String.valueOf(null));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(Math.abs(arr[i] - arr[j]) > a){
                    continue;
                }
                for (int k = j+1; k < arr.length; k++){
                    if(i == j || i == k || j == k){
                        continue;
                    }
                    if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        System.out.println("第"+count+"组数据: " + arr[i] + "," + arr[j] + "," + arr[k]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
