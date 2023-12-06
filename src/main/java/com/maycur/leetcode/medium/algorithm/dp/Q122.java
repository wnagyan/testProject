package com.maycur.leetcode.medium.algorithm.dp;

import java.util.Arrays;

/**
 * 122. 买卖股票的最佳时机 II
 *
 * @topic 给你一个整数数组 prices ，其中prices[i] 表示某支股票第 i 天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候最多只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润。
 *
 * 链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii
 */
public class Q122 {

    public int maxProfit(int[] prices) {
        int sum = 0;
        int[] pp = new int[prices.length + 1];
        for (int i = 0; i < prices.length; i++){
            pp[i] = prices[i];
        }
        pp[prices.length] = 0;
        int end = pp[0], beginIndex = pp[0];
        for (int i = 0; i < prices.length; i++){
            end = pp[i];
            if (pp[i] > pp[i+1]){
                sum += end - beginIndex;
                beginIndex = pp[i+1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,6};
        int[] arr1 = new int[arr.length];
        arr1 = Arrays.copyOf(arr, arr.length);
        for (int i : arr1){
            System.out.println(i);
        }

    }
}
