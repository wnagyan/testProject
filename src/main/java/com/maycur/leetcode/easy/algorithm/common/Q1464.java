package com.maycur.leetcode.easy.algorithm.common;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 1464. 数组中两元素的最大乘积
 *
 * @topic 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
 * 请你计算并返回该式的最大值。
 *
 * 链接：https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array
 */
public class Q1464 {

    public int maxProduct(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int i : nums){
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return (list.get(0) - 1) * (list.get(1) - 1);
    }
}
