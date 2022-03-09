package com.maycur.leetcode.easy.algorithm;

/**
 * 1119. 将每个元素替换为右侧最大元素
 *
 * @topic 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * 完成所有替换操作后，请你返回这个数组。
 *
 * 链接：https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class Q1299 {

    public int[] replaceElements(int[] arr) {
        int[] newArr = new int[arr.length];
        int max = -1;
        for (int i = arr.length - 2; i >= 0; i--){
            newArr[i] = max;
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        newArr[arr.length-1] = -1;
        return newArr;
    }
}
