package com.maycur.leetcode.easy.algorithm.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 2341. 数组能形成多少数对
 *
 * @topic 给你一个下标从 0 开始的整数数组 nums 。在一步操作中，你可以执行以下步骤：
 *
 *      从 nums 选出 两个 相等的 整数
 *      从 nums 中移除这两个整数，形成一个 数对
 *
 * 请你在 nums 上多次执行此操作直到无法继续执行。
 * 返回一个下标从 0 开始、长度为 2 的整数数组 answer 作为答案，其中 answer[0] 是形成的数对数目，answer[1] 是对 nums 尽可能执行上述操作后剩下的整数数目。
 *
 * 链接：https://leetcode.cn/problems/maximum-number-of-pairs-in-array
 */
public class Q2341 {

    public int[] numberOfPairs(int[] nums) {
        int[] result = new int[2];
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums){
            if (map.get(i) != null && !map.get(i).equals(0)){
                map.put(i, map.get(i) - 1);
                count++;
            }else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        result[0] = count;
        count = 0;
        for (Integer key : map.keySet()){
            if (!map.get(key).equals(0)){
                count ++;
            }
        }
        result[1] = count;
        return result;
    }
}
