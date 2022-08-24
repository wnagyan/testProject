package com.maycur.leetcode.medium.algorithm.dynamic;

/**
 * 64. 最小路径和
 *
 * @topic: 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * 链接：https://leetcode.cn/problems/minimum-path-sum/
 */
public class Q64 {

    public static void main(String[] args) {
        minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
    }

    public static int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if(i == 0 && j > 0){
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                }else if (i > 0 && j == 0){
                    grid[i][j] = grid[i-1][j] + grid[i][j];
                }else if (i == 0 && j == 0){
                    grid[i][j] = grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
                }
                System.out.println(grid[i][j]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
