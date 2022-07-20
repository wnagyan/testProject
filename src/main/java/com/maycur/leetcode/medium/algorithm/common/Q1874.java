package com.maycur.leetcode.medium.algorithm.common;

import java.util.Arrays;

/**
 * 1874. 两个数组的最小乘积和
 *
 * @topic 给定两个长度相等的数组a和b，它们的乘积和为数组中所有的a[i] * b[i]之和，其中0 <= i < a.length。
 *
 * 比如a = [1,2,3,4]，b = [5,2,3,1]时，它们的乘积和为1*5 + 2*2 + 3*3 + 4*1 = 22
 * 现有两个长度都为n的数组nums1和nums2，你可以以任意顺序排序nums1，请返回它们的最小乘积和。
 *
 * 链接：https://leetcode.cn/problems/minimize-product-sum-of-two-arrays
 */
public class Q1874 {

    /**
     * 思路：每次找第一个数组里最大的与第二个数组最小的值相乘
     * 扩展思路：将第一个数组倒序排序，第二个数组顺序排序，对应元素相乘
     * @param nums1
     * @param nums2
     * @return
     */
    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sum = 0;
        for (int i = 0; i < nums1.length; i++){
            sum += nums1[i] * nums2[nums2.length-1-i];
        }
        return sum;
    }

}
