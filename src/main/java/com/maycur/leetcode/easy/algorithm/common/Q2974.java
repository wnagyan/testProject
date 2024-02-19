package com.maycur.leetcode.easy.algorithm.common;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * 2974. 最小数字游戏
 *
 * @topic 你有一个下标从 0 开始、长度为 偶数 的整数数组 nums ，同时还有一个空数组 arr 。Alice 和 Bob 决定玩一个游戏，游戏中每一轮 Alice 和 Bob 都会各自执行一次操作。游戏规则如下：
 *      每一轮，Alice 先从 nums 中移除一个 最小 元素，然后 Bob 执行同样的操作。
 *      接着，Bob 会将移除的元素添加到数组 arr 中，然后 Alice 也执行同样的操作。
 *      游戏持续进行，直到 nums 变为空。
 * 返回结果数组 arr 。
 *
 * 链接：https://leetcode.cn/problems/minimum-number-game/description/
 */
public class Q2974 {

    /**
     * 被移除的数字标记为-1
     * @param nums
     * @return
     */
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        int index = 0;
        while (nums.length > index*2){
            arr[index*2] = nums[index*2+1];
            arr[index*2+1] = nums[index*2];
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{11,2,3,4,5,6,7,8,9,10};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
