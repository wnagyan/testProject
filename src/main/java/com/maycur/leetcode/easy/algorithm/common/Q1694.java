package com.maycur.leetcode.easy.algorithm.common;

/**
 * 1694. 重新格式化电话号码
 *
 * @topic 给你一个字符串形式的电话号码 number 。number 由数字、空格 ' '、和破折号 '-' 组成。
 *
 * 请你按下述方式重新格式化电话号码。
 * 首先，删除 所有的空格和破折号。
 * 其次，将数组从左到右 每 3 个一组 分块，直到 剩下 4 个或更少数字。剩下的数字将按下述规定再分块：
 *      2 个数字：单个含 2 个数字的块。
 *      3 个数字：单个含 3 个数字的块。
 *      4 个数字：两个分别含 2 个数字的块。
 * 最后用破折号将这些块连接起来。注意，重新格式化过程中 不应该 生成仅含 1 个数字的块，并且 最多 生成两个含 2 个数字的块。
 * 返回格式化后的电话号码。
 *
 * 链接：https://leetcode.cn/problems/reformat-phone-number
 */
public class Q1694 {

    public static void main(String[] args) {
        System.out.println(reformatNumber("123"));;
    }

    public static String reformatNumber(String number) {
        String number1 = number.replace(" ", "").replace("-", "");
        int len = number1.length();
        StringBuilder stringBuilder = new StringBuilder("");
        if (len < 4){
            return number1;
        }
        int begin = 0;
        for (int i = 0; i < len; ){
            if (len - i == 4){
                int mid = (len - begin) / 2;
                stringBuilder.append(number1.substring(begin, begin+mid));
                stringBuilder.append("-");
                stringBuilder.append(number1.substring(begin+mid, len));
                break;
            } else if (len - i < 4){
                stringBuilder.append(number1.substring(begin, len));
                break;
            }
            i += 3;
            if(i >= len){
                break;
            }
            stringBuilder.append(number1.substring(begin, i));
            stringBuilder.append("-");
            begin = i;
        }
        return stringBuilder.toString();
    }
}
