package com.maycur.leetcode.easy.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 1134. 阿姆斯特朗数
 *
 * @topic 给你一个整数 n，让你来判定他是否是阿姆斯特朗数，是则返回 true，不是则返回 false。
 * 假设存在一个 k 位数 n，其每一位上的数字的 k 次幂的总和也是 n，那么这个数是阿姆斯特朗数 。
 *
 * 链接：https://leetcode-cn.com/problems/armstrong-number
 */
public class Q1134 {

    public static void main(String[] args) {
        isArmstrong(153);
    }

    public static boolean isArmstrong(int n) {
        int count = 0, num = n;
        int sum = 0;
        List<Integer> list = new ArrayList();
        while(num > 0){
            list.add(num % 10);
            num /= 10;
            count++;
        }
        System.out.println(count);
        for (double d : list){
            sum += Math.pow(d, count);
        }
        System.out.println(sum);
        if(sum != n){
            return false;
        }
        return true;
    }
}
