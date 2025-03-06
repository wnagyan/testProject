package com.maycur.leetcode.easy.algorithm.common;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 2942. 分类求和并作差
 *
 * @topic 给你两个正整数 n 和 m 。
 *
 * 现定义两个整数 num1 和 num2 ，如下所示：
 *
 * num1：范围 [1, n] 内所有 无法被 m 整除 的整数之和。
 * num2：范围 [1, n] 内所有 能够被 m 整除 的整数之和。
 * 返回整数 num1 - num2 。
 *
 * 链接：https://leetcode.cn/problems/divisible-and-non-divisible-sums-difference/description/
 */
public class Q2894 {

    public int differenceOfSums(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i % m != 0){
                sum += i;
            }else {
                sum -= i;
            }
        }
        return sum;
    }
}
