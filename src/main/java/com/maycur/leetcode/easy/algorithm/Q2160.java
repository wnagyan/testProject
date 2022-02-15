package com.maycur.leetcode.easy.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 2160. 拆分数位后四位数字的最小和
 *
 * @topic 给你一个四位 正 整数 num 。请你使用 num 中的 数位 ，将 num 拆成两个新的整数 new1 和 new2 。new1 和 new2 中可以有 前导 0 ，且 num 中 所有 数位都必须使用。
 *
 * 比方说，给你 num = 2932 ，你拥有的数位包括：两个 2 ，一个 9 和一个 3 。一些可能的 [new1, new2] 数对为 [22, 93]，[23, 92]，[223, 9] 和 [2, 329] 。
 * 请你返回可以得到的 new1 和 new2 的 最小 和。
 *
 * 链接：https://leetcode-cn.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits
 */
public class Q2160 {

    public static void main(String[] args) {
        minimumSum(2932);
    }

    public static int minimumSum(int num) {
        List<Integer> list = new ArrayList<>();
        list.add(num / 1000);
        list.add(num / 100 % 10);
        list.add(num / 10 % 10);
        list.add(num % 10);

        Collections.sort(list);
        list.forEach(System.out::println);

        return 10 * (list.get(0) + list.get(1)) + list.get(2) + list.get(3);
    }


}
