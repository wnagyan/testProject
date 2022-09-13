package com.maycur.leetcode.medium.algorithm.tree;

/**
 * 96. 不同的二叉搜索树
 *
 * @topic: 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。
 *
 * 链接：https://leetcode.cn/problems/unique-binary-search-trees/
 */
public class Q96 {

    public static void main(String[] args) {
        System.out.println(numTrees(3));;
    }

    //动态规划，等于左右两子树的乘积和
    public static int numTrees(int n) {
        int[] fun = new int[n+1];
        fun[0] = 1;
        fun[1] = 1;
        int sum = 1;
        for (int i = 2; i <= n; i++){
            for (int j = 1; j <= i; j++){
                fun[i] += fun[j-1] * fun[i-j];
                System.out.println(fun[i]);
            }
            System.out.println();
        }
        return fun[n];
    }
}
