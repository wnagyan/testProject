package com.maycur.leetcode.easy.algorithm.common;

/**
 *
 */
public class Q153 {

    public int findMin(int[] nums) {
        //判断数组是否是有序数组
        boolean flag = true;
        int minNum = nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                flag = false;
                minNum = nums[i];
            }
        }
        return minNum;
    }

    public int findMin1(int[] nums) {
        //判断数组是否是有序数组
        boolean flag = true;
        int minNum = nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                flag = false;
                minNum = nums[i];
            }
        }
        return minNum;
    }

}
