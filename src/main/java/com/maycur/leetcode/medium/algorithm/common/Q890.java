package com.maycur.leetcode.medium.algorithm.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 890. 查找和替换模式
 *
 * @topic 你有一个单词列表words和一个模式pattern，你想知道 words 中的哪些单词与模式匹配。
 * 如果存在字母的排列 p，使得将模式中的每个字母 x 替换为 p(x) 之后，我们就得到了所需的单词，那么单词与模式是匹配的。
 * （回想一下，字母的排列是从字母到字母的双射：每个字母映射到另一个字母，没有两个字母映射到同一个字母。）
 * 返回 words 中与给定模式匹配的单词列表。
 * 你可以按任何顺序返回答案。
 *
 * 链接：https://leetcode.cn/problems/find-and-replace-pattern
 */
public class Q890 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (String word : words){
            int num = 0;
            if (word.length() != pattern.length()){
                continue;
            }
            for (char c : word.toCharArray()){
                num = num * 10 + (c-'a' + 1);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println((('z' - 'a' + 1) * 10 + 26) % 33);
    }

}
