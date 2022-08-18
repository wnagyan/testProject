package com.maycur.leetcode.medium.algorithm.common;

/**
 * 1769. 移动所有球到每个盒子所需的最小操作数
 *
 * @topic: 有 n 个盒子。给你一个长度为 n 的二进制字符串 boxes ，其中 boxes[i] 的值为 '0' 表示第 i 个盒子是 空 的，而 boxes[i] 的值为 '1' 表示盒子里有 一个 小球。
 * 在一步操作中，你可以将 一个 小球从某个盒子移动到一个与之相邻的盒子中。第 i 个盒子和第 j 个盒子相邻需满足 abs(i - j) == 1 。注意，操作执行后，某些盒子中可能会存在不止一个小球。
 * 返回一个长度为 n 的数组 answer ，其中 answer[i] 是将所有小球移动到第 i 个盒子所需的 最小 操作数。
 * 每个 answer[i] 都需要根据盒子的 初始状态 进行计算。
 *
 * 链接：https://leetcode.cn/problems/minimum-number-of-operations-to-move-all-balls-to-each-box
 */
public class Q1769 {

    public int[] minOperations(String boxes) {
        int[] stepNum = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++){
            int num = 0;
            for (int j = 0; j < boxes.length(); j++){
                if ('1' == boxes.charAt(j)){
                    num += Math.abs(j - i);
                }
            }
            stepNum[i] = num;
        }
        return stepNum;
    }
}
