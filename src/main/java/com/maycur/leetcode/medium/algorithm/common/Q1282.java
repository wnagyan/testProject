package com.maycur.leetcode.medium.algorithm.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1282 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> peopleList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : groupSizes){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < groupSizes.length; i++){
            List<Integer> groupList = new ArrayList<>();

        }
        return peopleList;
    }
}
