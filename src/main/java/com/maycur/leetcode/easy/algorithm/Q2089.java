package com.maycur.leetcode.easy.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 2089. 找出数组排序后的目标下标
 *
 * @topic 给你一个下标从 0 开始的整数数组 nums 以及一个目标元素 target 。
 * 目标下标 是一个满足nums[i] == target 的下标 i 。
 * 将 nums 按 非递减 顺序排序后，返回由 nums 中目标下标组成的列表。如果不存在目标下标，返回一个 空 列表。返回的列表必须按 递增 顺序排列。
 *
 * 链接：https://leetcode-cn.com/problems/find-target-indices-after-sorting-array
 */
public class Q2089 {

    public List<Integer> targetIndices(int[] nums, int target) {
        int minCount = 0, eqCount = 0;
        for(int i : nums){
            if(i < target) {
                minCount++;
            }else if(i == target){
                eqCount++;
            }
        }
        List<Integer> list = new ArrayList<>();

        for (int i = minCount; i < minCount + eqCount; i++){
            list.add(i);
        }
        return list;
    }
}
