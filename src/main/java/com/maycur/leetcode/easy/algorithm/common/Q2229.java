package com.maycur.leetcode.easy.algorithm.common;

import java.util.Arrays;

/**
 * 2229. 检查数组是否连贯
 *
 * @topic 给你一个整数数组 nums ，如果 nums 是一个 连贯数组 ，则返回 true ，否则返回 false 。
 * 如果数组包含 [x, x + n - 1] 范围内的所有数字（包括 x 和 x + n - 1 ），则该数组为连贯数组；其中 x 是数组中最小的数，n 是数组的长度。
 *
 * 链接：https://leetcode.cn/problems/check-if-an-array-is-consecutive
 */
public class Q2229 {

    public static boolean isConsecutive(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if (max < nums[i]){
                max = nums[i];
            }
        }
        if (min + nums.length - 1 != max){
            return false;
        }else {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++){
                if (nums[i] - nums[i-1] != 1){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isConsecutive(new int[]{3,4,5}));
    }
}
