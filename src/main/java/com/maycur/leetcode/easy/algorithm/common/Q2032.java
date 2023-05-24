package com.maycur.leetcode.easy.algorithm.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2032. 至少在两个数组中出现的值
 *
 * @topic 给你三个整数数组 nums1、nums2 和 nums3 ，请你构造并返回一个 元素各不相同的 数组，且由 至少 在 两个 数组中出现的所有值组成。数组中的元素可以按 任意 顺序排列。
 *
 * 链接：https://leetcode.cn/problems/two-out-of-three
 */
public class Q2032 {

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap();
        for (int i : nums1){
            map.put(i, 1);
        }
        for (int i : nums2){
            if (map.get(i) != null && map.get(i) == 1){
                list.add(i);
                map.put(i, 0);
            }
        }
        for (int i : nums3){
            if (map.get(i) != null && map.get(i) == 1){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        twoOutOfThree(new int[]{1,1,2,3}, new int[]{2,3}, new int[]{3});

    }
}
