package com.maycur.leetcode.easy.algorithm.common;

/**
 * 1304. 和为零的N个唯一整数
 *
 * @topic 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 *
 * 链接：https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
public class Q1304 {

    public int[] sumZero(int n) {
        int[] nums = new int[n];
        if(n % 2 == 1){
            nums[0] = 0;
            for (int i = 1; i <= n/2; i++){
                nums[i*2-1] = i;
                nums[i*2] = -1*i;
            }
        }else {
            for (int i = 0; i < n/2; i++){
                nums[i*2] = i*2+1;
                nums[i*2+1] = -1*(i*2+1);
            }
        }
        return nums;
    }
}
