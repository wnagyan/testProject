package com.maycur.leetcode.easy.algorithm.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 1380. 矩阵中的幸运数
 *
 * @topic 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 *      在同一行的所有元素中最小
 *      在同一列的所有元素中最大
 *
 * 链接：https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix
 */
public class Q1380 {

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            int min = matrix[i][0];
            int line = 0;
            int max = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                    line = j;
                }
            }
            for (int k = 0; k < matrix.length; k++){
                if(max < matrix[k][line]){
                    max = matrix[k][line];
                }
            }
            if(max == min){
                list.add(max);
            }
        }
        return list;
    }
}
