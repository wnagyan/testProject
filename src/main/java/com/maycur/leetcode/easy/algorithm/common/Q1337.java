package com.maycur.leetcode.easy.algorithm.common;

/**
 * 1337. 矩阵中战斗力最弱的 K 行
 *
 * @topic 给你一个大小为m* n的矩阵mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示。
 * 请你返回矩阵中战斗力最弱的k行的索引，按从最弱到最强排序。
 * 如果第i行的军人数量少于第j行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
 * 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 *
 * 链接：https://leetcode.cn/problems/the-k-weakest-rows-in-a-matrix
 */
public class Q1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] queue = new int[mat.length];
        int[] list = new int[k];
        for (int i = 0; i < mat.length; i++){
            int count = 0;
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == 1){
                    count++;
                }
            }
            queue[i] = count;
        }
        for (int i = 0; i < k; i++){
            list[i] = getIndex(queue);
            queue[list[i]] = 0;
        }
        return list;
    }

    public int getIndex(int[] queue){
        int min = queue[0];
        int index = 0;
        for (int i = 0; i < queue.length; i++){
            if(min > queue[i] && queue[i] != 0){
                min = queue[i];
                index = i;
            }
        }
        return index;
    }

}
