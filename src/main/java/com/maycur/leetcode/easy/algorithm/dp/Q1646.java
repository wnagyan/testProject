package com.maycur.leetcode.easy.algorithm.dp;

/**
 * 1646. 获取生成数组中的最大值
 *
 * @topic: 给你一个整数 n 。按下述规则生成一个长度为 n + 1 的数组 nums ：
 *
 * nums[0] = 0
 * nums[1] = 1
 * 当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
 * 当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
 * 返回生成数组 nums 中的 最大 值。
 *
 * 链接：https://leetcode.cn/problems/get-maximum-in-generated-array/
 */
public class Q1646 {

    public static int getMaximumGenerated(int n) {
        int maxNum = 0;
        int[] numArray = new int[n+1];
        if (n < 2){
            return n;
        }
        numArray[0] = 0;
        numArray[1] = 1;
        for (int i = 0; i < n+1; i++){
            int index = 2*i;
            int index1 = index + 1;
            if (index >= 2 && index <= n){
                numArray[index] = numArray[i];
                if (maxNum < numArray[index]){
                    maxNum = numArray[index];
                }
            }
            if (index1 >= 2 && index1 <= n){
                numArray[index1] = numArray[i] + numArray[i+1];
                if (maxNum < numArray[index1]){
                    maxNum = numArray[index1];
                }
            }
        }
        System.out.println(maxNum);
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println("abcd".replace("e", "a"));
    }
}
