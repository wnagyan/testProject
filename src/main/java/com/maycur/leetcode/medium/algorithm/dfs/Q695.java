package com.maycur.leetcode.medium.algorithm.dfs;

/**
 * 695. 岛屿的最大面积
 *
 * @topic 给你一个大小为 m x n 的二进制矩阵 grid 。
 * 岛屿是由一些相邻的1(代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在 水平或者竖直的四个方向上 相邻。你可以假设grid 的四个边缘都被 0（代表水）包围着。
 * 岛屿的面积是岛上值为 1 的单元格的数目。
 * 计算并返回 grid 中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。
 *
 * 链接：https://leetcode.cn/problems/max-area-of-island
 */
public class Q695 {

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    ans = Math.max(ans, dfs(grid, i, j));
                }
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, int x, int y){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0){
            return 0;
        }
        grid[x][y] = 0;
        return 1 + dfs(grid, x + 1, y)
                + dfs(grid, x - 1, y)
                + dfs(grid, x, y + 1)
                + dfs(grid, x, y - 1);
    }
}
