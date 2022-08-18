package com.maycur.leetcode.easy.algorithm.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1331. 数组序号转换
 *
 * @topic: 给你一个整数数组arr ，请你将数组中的每个元素替换为它们排序后的序号。
 *
 * 序号代表了一个元素有多大。序号编号的规则如下：
 *     序号从 1 开始编号。
 *     一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。
 *     每个数字的序号都应该尽可能地小。
 *
 * 链接：https://leetcode.cn/problems/rank-transform-of-an-array
 */
public class Q1331 {

    public static int[] arrayRankTransform(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        int[] indexArr = new int[arr.length];
        Map<Integer, Integer> map = new HashMap<>();
        int index = 1;
        for (int i = 0; i < newArr.length; i++){
            if (!map.keySet().contains(newArr[i])){
                map.put(newArr[i], index++);
            }
        }
        for (int i = 0; i < arr.length; i++){
            indexArr[i] = map.get(arr[i]);
        }
        return indexArr;
    }

    public static void main(String[] args) {
        arrayRankTransform(new int[]{
                37,12,28,9,12});
    }
}
