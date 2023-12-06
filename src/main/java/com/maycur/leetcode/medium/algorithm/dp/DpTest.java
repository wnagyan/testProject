package com.maycur.leetcode.medium.algorithm.dp;

public class DpTest {

    /**
     * 获取最大值
     * @param args
     */
    public static void main(String[] args) {
        int[][] g = new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};

        for (int i = g.length - 2; i >= 0; i--){
            for (int j = 0; j < g[i].length; j++){
                g[i][j] = Math.max(g[i+1][j], g[i+1][j+1]) + g[i][j];
            }
        }
        for (int i = 0; i < g.length; i++){
            for (int j = 0; j < g[i].length; j++){
                System.out.print(g[i][j] + " , ");
            }
            System.out.println();
        }
    }

    /**
     *         7
     *       3   8
     *     8   1   0
     *   2   7   4   4
     * 4   5   2   6   5
     *
     *
     * 30 ,
     * 23 , 21 ,
     * 20 , 13 , 10 ,
     * 7 , 12 , 10 , 10 ,
     * 4 , 5 , 2 , 6 , 5 ,
     */
}
