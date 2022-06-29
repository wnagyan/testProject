package com.maycur.leetcode.easy.algorithm.common;

import java.util.Arrays;

/**
 * 1502. 判断能否形成等差数列
 *
 * @topic 给你一个数字数组 arr 。
 * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
 *
 * 链接：https://leetcode.cn/problems/can-make-arithmetic-progression-from-sequence
 */
public class Q1502 {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++){
            if(arr[i] * 2 != arr[i-1] + arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[]{1,10,10,10,19}));
    }
}
