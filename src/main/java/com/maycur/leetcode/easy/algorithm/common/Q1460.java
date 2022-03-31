package com.maycur.leetcode.easy.algorithm.common;

import org.checkerframework.checker.units.qual.A;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 1460. 通过翻转子数组使两个数组相等
 *
 * @topic 给你两个长度相同的整数数组target和arr。每一步中，你可以选择arr的任意 非空子数组并将它翻转。你可以执行此过程任意次。
 * 如果你能让 arr变得与 target相同，返回 True；否则，返回 False
 *
 * 链接：https://leetcode-cn.com/problems/make-two-arrays-equal-by-reversing-sub-arrays
 */
public class Q1460 {

    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i : target){
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        for (int i : arr){
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }
        for (int i : map1.keySet()){
            if(map1.get(i) != map2.get(i)){
                return false;
            }
        }
        return true;
    }


}
