package com.maycur.leetcode.easy.algorithm.common;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2164. 对奇偶下标分别排序
 *
 * @topic: 给你一个下标从 0 开始的整数数组 nums 。根据下述规则重排 nums 中的值：
 *
 * 按 非递增 顺序排列 nums 奇数下标 上的所有值。
 *      举个例子，如果排序前 nums = [4,1,2,3] ，对奇数下标的值排序后变为 [4,3,2,1] 。奇数下标 1 和 3 的值按照非递增顺序重排。
 * 按 非递减 顺序排列 nums 偶数下标 上的所有值。
 *      举个例子，如果排序前 nums = [4,1,2,3] ，对偶数下标的值排序后变为 [2,1,4,3] 。偶数下标 0 和 2 的值按照非递减顺序重排。
 * 返回重排 nums 的值之后形成的数组。
 *
 * 链接：https://leetcode.cn/problems/sort-even-and-odd-indices-independently
 */
public class Q2164 {

    public static int[] sortEvenOdd(int[] nums) {
        Integer[] oddNums = new Integer[nums.length/2];
        Integer[] evenNums = null;
        if (nums.length % 2 == 0){
            evenNums = new Integer[nums.length/2];
        }else {
            evenNums = new Integer[(nums.length+1)/2];
        }

        int[] evenOddNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (i % 2 == 1){
                oddNums[i/2] = nums[i];
            }else {
                evenNums[i/2] = nums[i];
            }
        }
        Arrays.sort(oddNums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Arrays.sort(evenNums);
        for (int i = 0; i < nums.length; i++){
            if (i % 2 == 1){
                evenOddNums[i] = oddNums[i/2];
            }else {
                evenOddNums[i] = evenNums[i/2];
            }
        }
        return evenOddNums;
    }


    public static void main(String[] args) {
        sortEvenOdd(new int[]{5,39,33,5,12});
    }
}
