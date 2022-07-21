package com.maycur.leetcode.easy.algorithm.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 1791. 找出星型图的中心节点
 *
 * @topic 有一个无向的 星型 图，由 n 个编号从 1 到 n 的节点组成。星型图有一个 中心 节点，并且恰有 n - 1 条边将中心节点与其他每个节点连接起来。
 * 给你一个二维整数数组 edges ，其中edges[i] = [ui, vi] 表示在节点 ui 和 vi 之间存在一条边。请你找出并返回edges 所表示星型图的中心节点。
 *
 * 链接：https://leetcode.cn/problems/find-center-of-star-graph
 */
public class Q1791 {

    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < edges[i].length; j++){
                map.put(edges[i][j], map.getOrDefault(edges[i][j], 0) + 1);
            }
        }
        for (Integer key : map.keySet()){
            if (map.get(key) == 2){
                return key;
            }
        }
        return 0;
    }
}
