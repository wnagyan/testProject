package com.maycur.leetcode.offerI;

/**
 * 剑指 Offer 04. 二维数组中的查找
 *
 * @topic 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 */
public class Offer04 {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] > target){
                break;
            }
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[0][j] > target){
                    break;
                }
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        findNumberIn2DArray(new int[][]{}, 1);
    }
}
