package com.maycur.leetcode.easy.algorithm.linkedList;

/**
 * 203. 移除链表元素
 *
 * @topic 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *
 * 链接：https://leetcode.cn/problems/remove-linked-list-elements/
 */
public class Q203 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(-1);
        ListNode prev = newHead;
        while (head != null){
            if (head.val == val){
                prev.next = head.next;
            }else {
                prev.next = head;
                prev = prev.next;
            }
            head = head.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode.printNode(removeElements(ListNode.buildNode(new int[]{1,2,6,3,4,5,6}), 6));
    }
}
