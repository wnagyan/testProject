package com.maycur.leetcode.offer;

import java.util.Stack;

/**
 * 剑指 Offer 24. 反转链表
 * @topic: 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
 */
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode endNode = null;
        while (head != null){
            ListNode node = head.next;
            head.next = endNode;
            endNode = head;
            head = node;
        }
        return endNode;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
