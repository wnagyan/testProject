package com.maycur.leetcode.medium.algorithm.dynamic;

import java.nio.channels.Pipe;

/**
 * 714. 买卖股票的最佳时机含手续费
 *
 * @topic 给定一个整数数组prices，其中 prices[i]表示第i天的股票价格 ；整数fee 代表了交易股票的手续费用。
 * 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 * 返回获得利润的最大值。
 * 注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
 *
 * 链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
 */
public class Q714 {

    //prices = [1, 3, 2, 8, 4, 9], fee = 2
    public static int maxProfit(int[] prices, int fee) {
        int sum = 0;
        int beginIndex = 0;
        if (prices[0] < prices[1]){
            beginIndex = 0;
        }else {
            for (int i = 1; i < prices.length; i++){
                if (prices[i-1] > prices[i]){
                    beginIndex = i;
                    break;
                }
            }
        }
        for (int i = beginIndex; i < prices.length-1; i++){
            if (prices[i+1] < prices[i] && (prices[i] - prices[beginIndex]) > fee){
                sum += prices[i] - prices[beginIndex] - fee;
                beginIndex = i+1;
            }
            if (i + 1 == prices.length - 1 && prices[i+1] > prices[i] && prices[i+1] - prices[beginIndex] > fee){
                sum += prices[i+1] - prices[beginIndex] - fee;
                beginIndex = i+1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,3,7,5,10,3}, 3));
    }
}
