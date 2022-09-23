package com.maycur.leetcode.easy.algorithm.common;

import java.util.List;

/**
 * 1640. 能否连接形成数组
 *
 * @topic 给你一个整数数组 arr ，数组中的每个整数 互不相同 。另有一个由整数数组构成的数组 pieces，其中的整数也 互不相同 。
 * 请你以 任意顺序 连接 pieces 中的数组以形成 arr 。但是，不允许 对每个数组 pieces[i] 中的整数重新排序。
 * 如果可以连接 pieces 中的数组形成 arr ，返回 true ；否则，返回 false 。
 *
 * 链接：https://leetcode.cn/problems/check-array-formation-through-concatenation
 */
public class Q1640 {

    public static void main(String[] args) {
        System.out.println(canFormArray(new int[]{15,88}, new int[][]{{88},{15}}));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        int i = 0;
        int len = 0;
        for ( ; i < arr.length; i++){
            for (int j = 0; j < pieces.length; j++){
                if (pieces[j][0] == arr[i] && i + pieces[j].length <= arr.length){
                    int index = i;
                    for (int k = 0; k < pieces[j].length; k++){
                        if (pieces[j][k] != arr[index]){
                            return false;
                        }
                        index++;
                    }
                    i += pieces[j].length - 1;
                    len += pieces[j].length;
                    break;
                }
            }
        }
        return i == len;
    }
}
