package com.maycur.leetcode.medium.algorithm.dynamic;

/**
 * 62. 不同路径
 *
 * @topic: 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 *
 * 链接：https://leetcode.cn/problems/unique-paths
 */
public class Q62 {

    public int uniquePaths(int m, int n) {
        if(m <= 1 || n <= 1){
            return 1;
        }
        int count = 0;
        count += uniquePaths(m-1, n) + uniquePaths(m, n-1);
        return count;
    }

    public int uniquePaths1(int m, int n) {
        int[][] fun = new int[m][n];
        for (int i = 0; i < m; i++){
            fun[i][0] = 1;
        }
        for (int i = 0; i < n; i++){
            fun[0][i] = 1;
        }
        for (int i = 0; i < m - 1; i++){
            for (int j = 0; j < n - 1; j++){
                fun[i][j] = fun[i+1][j] + fun[i][j+1];
            }
        }
        return fun[m][n];
    }
}
