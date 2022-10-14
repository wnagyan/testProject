package com.maycur.leetcode.easy.algorithm.common;

/**
 * 1184. 公交站间的距离
 *
 * @topic 环形公交路线上有n个站，按次序从0到n - 1进行编号。我们已知每一对相邻公交站之间的距离，distance[i]表示编号为i的车站和编号为(i + 1) % n的车站之间的距离。
 * 环线上的公交车都可以按顺时针和逆时针的方向行驶。
 * 返回乘客从出发点start到目的地destination之间的最短距离。
 *
 * 链接：https://leetcode.cn/problems/distance-between-bus-stops
 */
public class Q1184 {

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int ssum = 0, sum = 0;
        if (start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        for (int i = 0; i < distance.length; i++){
            if (i >= start && i < destination){
                ssum += distance[i];
            }
            sum += distance[i];
        }
        return ssum >= (sum - ssum) ? (sum - ssum) : ssum;
    }

    public static void main(String[] args) {
        distanceBetweenBusStops(new int[]{3,6,7,2,9,10,7,16,11}, 6, 2);
    }
}
