package com.maycur.leetcode.easy.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 1436. 旅行终点站
 *
 * @topic: 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。
 * 请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
 * 题目数据保证线路图会形成一条不存在循环的线路，因此恰有一个旅行终点站。
 *
 * 链接：https://leetcode-cn.com/problems/destination-city
 */
public class Q1436 {

    public String destCity(List<List<String>> paths) {

        Map<String, Integer> path = new HashMap<>();
        AtomicReference<String> str = new AtomicReference<>("");
        paths.forEach(t -> t.forEach(s -> {
            path.put(s, path.getOrDefault(s, 0) + 1);
        }));
        paths.forEach(t -> {
            if(path.get(t.get(1)) == 1){
                str.set(t.get(1));
            }
        });
        return str.get();
    }
}
/**
 * 提示：遍历cityB，返回不在cityA的城市
 */