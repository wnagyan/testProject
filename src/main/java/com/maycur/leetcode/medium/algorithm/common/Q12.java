package com.maycur.leetcode.medium.algorithm.common;

import lombok.NonNull;
import org.checkerframework.checker.units.qual.A;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 12. 整数转罗马数字
 *
 * @topic: 例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
 *
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 * 给你一个整数，将其转为罗马数字。
 *
 * 链接：https://leetcode.cn/problems/integer-to-roman
 */
public class Q12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        while (num > 0){
            int k = 1;
            for (Integer key : map.keySet()){
                if (num >= key){
                    k = key;
                }
            }
            str.append(map.get(k));
            num -= k;
        }
        return str.toString();
    }

}
