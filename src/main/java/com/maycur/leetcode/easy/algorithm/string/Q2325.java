package com.maycur.leetcode.easy.algorithm.string;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * 2325. 解密消息
 *
 * @topic: 给你字符串 key 和 message ，分别表示一个加密密钥和一段加密消息。解密 message 的步骤如下：
 *
 * 使用 key 中 26 个英文小写字母第一次出现的顺序作为替换表中的字母 顺序 。
 * 将替换表与普通英文字母表对齐，形成对照表。
 * 按照对照表 替换 message 中的每个字母。
 * 空格 ' ' 保持不变。
 * 例如，key = "happy boy"（实际的加密密钥会包含字母表中每个字母 至少一次），据此，可以得到部分对照表（'h' -> 'a'、'a' -> 'b'、'p' -> 'c'、'y' -> 'd'、'b' -> 'e'、'o' -> 'f'）。
 * 返回解密后的消息。
 *
 * 链接：https://leetcode.cn/problems/decode-the-message
 */
public class Q2325 {

    public static String decodeMessage(String key, String message) {
        StringBuilder stringBuilder = new StringBuilder("");
        char[] chars = new char[26];
        int[] flag = new int[26];
        for (int i = 0; i < flag.length; i++){
            flag[i] = 0;
        }
        int i = 0;
        char j = 'a';
        for (Character c : key.toCharArray()){
            if (c == ' '){
                continue;
            }
            if (flag[c - 'a'] == 0){
                chars[c - 'a'] = j++;
                flag[c - 'a'] = 1;
            }
        }
        for (Character c : message.toCharArray()){
            if (c == ' '){
                stringBuilder.append(" ");
                continue;
            }
            stringBuilder.append(chars[c - 'a']);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
