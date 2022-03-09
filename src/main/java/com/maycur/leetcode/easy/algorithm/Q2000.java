package com.maycur.leetcode.easy.algorithm;

/**
 * 2000. 反转单词前缀
 *
 * @topic 给你一个下标从 0 开始的字符串 word 和一个字符 ch 。找出 ch 第一次出现的下标 i ，反转 word 中从下标 0 开始、直到下标 i 结束（含下标 i ）的那段字符。如果 word 中不存在字符 ch ，则无需进行任何操作。
 * 例如，如果 word = "abcdefd" 且 ch = "d" ，那么你应该 反转 从下标 0 开始、直到下标 3 结束（含下标 3 ）。结果字符串将会是 "dcbaefd" 。
 * 返回 结果字符串 。
 *
 * 链接：https://leetcode-cn.com/problems/reverse-prefix-of-word
 */
public class Q2000 {

    public String reversePrefix(String word, char ch) {
        String str = "";
        int start = 0;
        boolean flag = false;
        for (int i = 0; i < word.toCharArray().length; i++){
            char c = word.charAt(i);
            str += c;
            start = i + 1;
            if(c == ch){
                flag = true;
                break;
            }
        }
        if(!flag){
            return word;
        }
        str = reverse(str) + word.substring(start, word.length());
        return str;
    }

    public String reverse(String string){
        String nstr = "";
        for (int i = string.toCharArray().length - 1; i >= 0; i--){
            nstr += string.charAt(i);
        }
        return nstr;
    }

    /**
     * 解法2：直接开始反转字符串，一直反转到ch的位置，如果没找到就直接返回原字符串
     * @param word
     * @param ch
     * @return
     */
    public String reversePrefix1(String word, char ch) {
        if(word.indexOf(ch) > 0){
            char[] arr = word.toCharArray();
            int right = word.indexOf(ch), left = 0;
            while (left < right){
                char c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;
                left++;
                right--;
            }
            return new String(arr);
        }
        return word;
    }
}
