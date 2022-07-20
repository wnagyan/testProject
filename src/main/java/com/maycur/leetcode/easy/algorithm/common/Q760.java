package com.maycur.leetcode.easy.algorithm.common;

/**
 * 760. 找出变位映射
 *
 * @topic 给定两个列表 A and B，并且 B 是 A 的变位（即 B 是由 A 中的元素随机排列后组成的新列表）。
 *
 * 我们希望找出一个从 A 到 B 的索引映射 P 。一个映射 P[i] = j 指的是列表 A 中的第 i 个元素出现于列表 B 中的第 j 个元素上。
 * 列表 A 和 B 可能出现重复元素。如果有多于一种答案，输出任意一种。
 *
 * 链接：https://leetcode.cn/problems/find-anagram-mappings
 */
public class Q760 {

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] indexs = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    indexs[i] = j;
                }
            }
        }
        return indexs;
    }
}
