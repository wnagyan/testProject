package com.maycur.leetcode.easy.algorithm.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2206. 将数组划分成相等数对
 *
 * @topic 给你一个整数数组nums，它包含2 * n个整数。
 * 你需要将nums 划分成n个数对，满足：
 *
 * 每个元素 只属于一个 数对。
 * 同一数对中的元素 相等。
 * 如果可以将 nums划分成 n个数对，请你返回 true，否则返回 false。
 *
 * 链接：https://leetcode-cn.com/problems/divide-array-into-equal-pairs
 */
public class Q2206 {

    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer key : map.keySet()){
            if(map.get(key) % 2 == 1){
                return false;
            }
        }
        return true;
    }

    public boolean divideArray1(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
               sum += nums[i];
            }else {
                sum -= nums[i];
            }
        }
        return sum == 0;
    }
}
