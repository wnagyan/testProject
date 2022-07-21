package com.maycur.leetcode.easy.algorithm.string;

/**
 * 2315. 统计星号
 *
 * @topic 给你一个字符串s，每两个连续竖线'|'为 一对。换言之，第一个和第二个'|'为一对，第三个和第四个'|'为一对，以此类推。
 *
 * 请你返回 不在 竖线对之间，s中'*'的数目。
 * 注意，每个竖线'|'都会 恰好属于一个对。
 *
 * 链接：https://leetcode.cn/problems/count-asterisks
 */
public class Q2315 {

    public static int countAsterisks(String s) {
        String[] split = s.split("\\|");
        int count = 0;
        for (int i = 0; i < split.length; i += 2){
            String str = split[i];
            for (Character c : str.toCharArray()){
                if (c == '*'){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
    }
}
