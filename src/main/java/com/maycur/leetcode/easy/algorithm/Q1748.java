package com.maycur.leetcode.easy.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1748. 唯一元素的和
 *
 * @topic: 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
 * 请你返回 nums 中唯一元素的 和 。
 *
 * 链接：https://leetcode-cn.com/problems/sum-of-unique-elements/
 */
public class Q1748 {

    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer integer : map.keySet()){
            if(map.get(integer) == 1){
                sum += integer;
            }
        }
        return sum;
    }
}
