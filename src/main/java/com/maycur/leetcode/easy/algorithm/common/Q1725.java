package com.maycur.leetcode.easy.algorithm.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 1725. 可以形成最大正方形的矩形数目
 *
 * @topic 给你一个数组 rectangles ，其中 rectangles[i] = [li, wi] 表示第 i 个矩形的长度为 li 、宽度为 wi 。
 *
 * 如果存在 k 同时满足 k <= li 和 k <= wi ，就可以将第 i 个矩形切成边长为 k 的正方形。例如，矩形 [4,6] 可以切成边长最大为 4 的正方形。
 * 设 maxLen 为可以从矩形数组rectangles 切分得到的 最大正方形 的边长。
 * 请你统计有多少个矩形能够切出边长为 maxLen 的正方形，并返回矩形 数目 。
 *
 * 链接：https://leetcode.cn/problems/number-of-rectangles-that-can-form-the-largest-square
 */
public class Q1725 {

    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rectangles.length; i++){
            int min = rectangles[i][0];
            for (int j = 0; j < rectangles[i].length; j++){
                if (min > rectangles[i][j]){
                    min = rectangles[i][j];
                }
            }
            map.put(min, map.getOrDefault(min, 0) + 1);
            if (maxLen < min){
                maxLen = min;
            }
        }
        return map.get(maxLen);
    }
}
