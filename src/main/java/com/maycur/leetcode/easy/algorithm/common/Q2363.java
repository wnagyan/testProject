package com.maycur.leetcode.easy.algorithm.common;

import java.util.*;

/**
 * 2363. 合并相似的物品
 *
 * @topic 给你两个二维整数数组items1 和items2，表示两个物品集合。每个数组items有以下特质：
 *
 *      items[i] = [valuei, weighti] 其中valuei表示第i件物品的价值，weighti表示第 i件物品的 重量。
 *      items中每件物品的价值都是 唯一的。
 *
 * 请你返回一个二维数组ret，其中ret[i] = [valuei, weighti]，weighti是所有价值为valuei物品的重量之和。
 * 注意：ret应该按价值 升序排序后返回。
 *
 * 链接：https://leetcode.cn/problems/merge-similar-items
 */
public class Q2363 {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> results = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] i : items1){
            map.put(i[0], map.getOrDefault(i[0], 0) + i[1]);
        }
        for (int[] j : items2){
            map.put(j[0], map.getOrDefault(j[0], 0) + j[1]);
        }
        List<Goods> goodsList = new ArrayList<>();
        for (int key : map.keySet()){
            Goods goods = new Goods(key, map.get(key));
            goodsList.add(goods);
        }
        Collections.sort(goodsList, Comparator.comparing(Goods::getValue));
        for (Goods goods : goodsList){
            List<Integer> list = new ArrayList<>();
            list.add(goods.getValue());
            list.add(goods.getWeight());
            results.add(list);
        }
        return results;
    }

    class Goods{

        private Integer value;
        private Integer weight;

        public Goods(Integer value, Integer weight) {
            this.value = value;
            this.weight = weight;
        }

        public Integer getValue() {
            return value;
        }

        public Integer getWeight() {
            return weight;
        }
    }
}
