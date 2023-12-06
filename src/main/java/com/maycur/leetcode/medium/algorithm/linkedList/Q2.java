package com.maycur.leetcode.medium.algorithm.linkedList;

import java.util.HashMap;

/**
 * 2. 两数相加
 *
 * @topic: 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 链接：https://leetcode.cn/problems/add-two-numbers/
 */
public class Q2 {

    /**
     * 由于节点数量在1~100之间，不能转为数字类型进行加减，只能采用进位法进行相加
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode();
        ListNode head = cur;
        Integer carry = 0;
        while (l1 != null || l2 != null){
            Integer num = carry;
            if (l1 != null){
                num += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                num += l2.val;
                l2 = l2.next;
            }
            carry = num / 10;
            cur.next = new ListNode(num % 10);
            cur = cur.next;
        }
        if (carry > 0){
            cur.next = new ListNode(1);
        }
        return head.next;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{9,9,9,9,9,9,9};
        int[] array2 = new int[]{9,9,9,9};

        ListNode l1 = ListNode.buildNode(array1);
        ListNode l2 = ListNode.buildNode(array2);

        ListNode listNode = addTwoNumbers(l1, l2);
        ListNode.printNode(listNode);
    }

}
