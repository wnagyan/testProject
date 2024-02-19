package com.maycur.leetcode.medium.algorithm.common;

/**
 * 11. 盛最多水的容器
 *
 * @topic 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 *
 * 链接：https://leetcode.cn/problems/container-with-most-water/
 */
public class Q11 {

    /**
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int maxNum = 0;
        int i = 0,j = height.length-1;
        while (true){
            if (i == j){
                return maxNum;
            }
            int area = Math.min(height[i],height[j])*(j-i);
            if (area > maxNum){
                maxNum = area;
            }else {
                if (height[i] < height[j]){
                    i++;
                }else {
                    j--;
                }
            }
        }
    }

    //1,6,8,10
    //8,8,7,3
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7,2,3}));
    }
}
