package com.maycur.leetcode.easy.algorithm.common;

/**
 * 1323. 统计有序矩阵中的负数
 *
 * @topic 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 请你统计并返回 grid 中 负数 的数目。
 *
 * 链接：https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class Q1351 {

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
