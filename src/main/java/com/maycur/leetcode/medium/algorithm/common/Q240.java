package com.maycur.leetcode.medium.algorithm.common;

import com.google.common.collect.Lists;

import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.List;

/**
 * 240. 搜索二维矩阵 II
 *
 * @topic 编写一个高效的算法来搜索m * n矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *      每行的元素从左到右升序排列。
 *      每列的元素从上到下升序排列。
 *
 * 链接：https://leetcode.cn/problems/search-a-2d-matrix-ii
 */
public class Q240 {

    /**
     * 暴力法，设置边缘条件，缩小遍历范围
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix1(int[][] matrix, int target) {
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

    /**
     * 二分法，缩小遍历范围，然后对每行数据进行二分查找（更慢）
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix2(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] > target){
                break;
            }
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[0][j] > target){
                    break;
                }
                list.add(matrix[i][j]);
            }
            if (binarySearch(list, target)){
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(List<Integer> list, int target){
        int left = 0;
        int right = list.size();
        while (left < right){
            int mid = (left + right) / 2;
            if (list.get(mid) == target){
                return true;
            }
            if (list.get(mid) > target){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(binarySearch(Lists.newArrayList(1,2,3, 6, 7, 8, 9), 5));
    }
}
