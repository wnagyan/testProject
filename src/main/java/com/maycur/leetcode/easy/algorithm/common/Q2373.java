package com.maycur.leetcode.easy.algorithm.common;

/**
 * 2413. 最小偶倍数
 *
 * @topic 给你一个大小为 n x n 的整数矩阵 grid 。
 * 生成一个大小为(n - 2) x (n - 2) 的整数矩阵 maxLocal ，并满足：
 *
 * maxLocal[i][j] 等于 grid 中以 i + 1 行和 j + 1 列为中心的 3 x 3 矩阵中的 最大值 。
 * 换句话说，我们希望找出 grid 中每个3 x 3 矩阵中的最大值。
 *
 * 链接：https://leetcode.cn/problems/largest-local-values-in-a-matrix
 */
public class Q2373 {

    int[][] index = new int[][]{{0,1},{1,0},{1,-1},{-1,1},{-1,0},{0,-1},{1,1},{-1,-1}};

    public int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length-2][grid.length-2];
        for (int i = 1; i < grid.length-1; i++){
            for (int j = 1; j < grid.length-1; j++){
                result[i-1][j-1] = getMaxnum(grid, i, j);
            }
        }
        return result;
    }

    public int getMaxnum(int[][] grid, int x, int y){
        int max = grid[x][y];
        for (int i = 0; i < index.length; i++){
            max = Math.max(max, grid[x + index[i][0]][y + index[i][1]]);
        }
        return max;
    }
}
