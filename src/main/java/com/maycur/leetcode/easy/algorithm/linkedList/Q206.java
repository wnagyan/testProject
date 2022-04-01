package com.maycur.leetcode.easy.algorithm.linkedList;

/**
 * 206. 反转链表
 *
 * @topic: 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class Q206 {

    public ListNode reverseList(ListNode head) {
        ListNode q = null;
        ListNode p = head;
        while (p != null){
            ListNode temp = p.next;
            p.next = q;
            q = p;
            p = temp;
        }
        return q;
    }
}
