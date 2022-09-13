package com.maycur.leetcode.util;

/**
 * 二维数据工具类
 */
public class TwoDimensionalArrayUtil {

    /**
     * 打印二维数组
     */
    public static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
