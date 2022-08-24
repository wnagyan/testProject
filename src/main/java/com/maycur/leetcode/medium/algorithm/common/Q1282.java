package com.maycur.leetcode.medium.algorithm.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1282. 用户分组
 *
 * @topic: 有n个人被分成数量未知的组。每个人都被标记为一个从 0 到 n - 1 的唯一ID。
 * 给定一个整数数组 groupSizes ，其中groupSizes[i]是第 i 个人所在的组的大小。例如，如果groupSizes[1] = 3，则第 1 个人必须位于大小为 3 的组中。
 * 返回一个组列表，使每个人 i 都在一个大小为groupSizes[i]的组中。
 * 每个人应该恰好只出现在一个组中，并且每个人必须在一个组中。如果有多个答案，返回其中任何一个。可以保证给定输入至少有一个有效的解。
 *
 * 链接：https://leetcode.cn/problems/group-the-people-given-the-group-size-they-belong-to
 */
public class Q1282 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> peopleList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : groupSizes){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (Integer key : map.keySet()){
            int time = map.get(key) / key;
            for (int i = 0; i < time; i++){
                List<Integer> groupList = new ArrayList<>();



            }
        }

        return peopleList;
    }
}
