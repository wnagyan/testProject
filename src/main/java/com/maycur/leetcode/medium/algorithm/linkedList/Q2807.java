package com.maycur.leetcode.medium.algorithm.linkedList;

/**
 * 2807. 在链表中插入最大公约数
 *
 * @topic: 给你一个链表的头 head ，每个结点包含一个整数值。
 * 在相邻结点之间，请你插入一个新的结点，结点值为这两个相邻结点值的 最大公约数 。
 * 请你返回插入之后的链表。
 * 两个数的 最大公约数 是可以被两个数字整除的最大正整数。
 *
 * 链接：https://leetcode.cn/problems/insert-greatest-common-divisors-in-linked-list/description/
 */
public class Q2807 {

    /**
     * head = [18,6,10,3]
     * [18,6,6,2,10,1,3]
     */
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur.next != null){
            ListNode next = cur.next;
            int gcd = getGcd(cur.val, next.val);
            cur.next = new ListNode(gcd, next);
            cur = next;
        }
        return head;
    }

    private int getGcd(int a, int b){
        while (b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
