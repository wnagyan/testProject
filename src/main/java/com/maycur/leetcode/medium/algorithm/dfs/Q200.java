package com.maycur.leetcode.medium.algorithm.dfs;

/**
 * 200. 岛屿数量
 *
 * @topic 给你一个由'1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 * 链接：https://leetcode.cn/problems/number-of-islands
 */
public class Q200 {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                //如果等于1则判断是岛屿，数量加1且将该岛屿从地图上抹去
                if (grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    //将遍历过的岛屿从地图上抹去
    public void dfs(char[][] grid, int x, int y){
        if (x >= grid.length || y >= grid[0].length || x < 0 || y < 0 || grid[x][y] == '0'){
            return ;
        }
        //将陆地变为水，防止重复遍历
        grid[x][y] = '0';
        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }

    public static void main(String[] args) {

    }
}
