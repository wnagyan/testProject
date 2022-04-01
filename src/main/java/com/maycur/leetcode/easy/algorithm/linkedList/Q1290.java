package com.maycur.leetcode.easy.algorithm.linkedList;

/**
 * 1290. 二进制链表转整数
 *
 * @topic 给你一个单链表的引用结点head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 *
 * 链接：https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer
 */
public class Q1290 {

    public int getDecimalValue(ListNode head) {
        int num = 0;
        StringBuilder str = new StringBuilder("");
        while (head.next != null){
            str.append(head.val);
            head = head.next;
        }
        System.out.println(str);
        str = str.reverse();
        for (int i = 0; i < str.length(); i++){
            
        }
        return num;
    }
}
