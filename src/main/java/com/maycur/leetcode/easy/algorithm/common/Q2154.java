package com.maycur.leetcode.easy.algorithm.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 2154. 将找到的值乘以 2
 *
 * @topic 给你一个整数数组 nums ，另给你一个整数 original ，这是需要在 nums 中搜索的第一个数字。
 *
 * 接下来，你需要按下述步骤操作：
 * 如果在 nums 中找到 original ，将 original乘以 2 ，得到新 original（即，令 original = 2 * original）。
 * 否则，停止这一过程。
 * 只要能在数组中找到新 original ，就对新 original 继续 重复 这一过程。
 * 返回 original 的 最终 值。
 *
 * 链接：https://leetcode-cn.com/problems/keep-multiplying-found-values-by-two
 */
public class Q2154 {

    public int findFinalValue(int[] nums, int original) {

        List<Integer> list = new ArrayList<>();
        for (int i : nums){
            list.add(i);
        }
        while (true){
            if(list.indexOf(original) == -1){
                return original;
            }else {
                original = original * 2;
            }
        }

    }
}
