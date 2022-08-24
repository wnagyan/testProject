package com.maycur.leetcode.easy.algorithm.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1213. 三个有序数组的交集
 *
 * @topic: 给出三个均为 严格递增排列 的整数数组 arr1，arr2 和 arr3。返回一个由 仅 在这三个数组中 同时出现 的整数所构成的有序数组。
 *
 * 链接：https://leetcode.cn/problems/intersection-of-three-sorted-arrays/
 */
public class Q1213 {

    public static void main(String[] args) {
//        System.out.println(binarySearch(new int[]{2, 4, 6, 7, 9, 12}, 5));;
    }

    //方案1：用二分查找
    //方案2：用map存储，找出value为3的key，数组很长的时候比方案1慢很多
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr1){
            if (binarySearch(arr2, i) && binarySearch(arr3, i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean binarySearch(int[] arr, int targetNum){
        int left = 0;
        int right = arr.length;
        while (left < right){
            int min = (left + right) / 2;
            if (arr[min] == targetNum){
                return true;
            }
            if (arr[min] > targetNum){
                right = min;
            }else if (arr[min] < targetNum){
                left = min + 1;
            }
        }
        return false;
    }

    public List<Integer> arraysIntersection1(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr2){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr3){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()){
            if (map.get(key) == 3){
                list.add(key);
            }
        }
        return list;
    }
}
