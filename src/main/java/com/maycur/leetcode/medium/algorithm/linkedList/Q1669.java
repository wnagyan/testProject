package com.maycur.leetcode.medium.algorithm.linkedList;

/**
 * 2807. 在链表中插入最大公约数
 *
 * @topic: 给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。
 * 请你将 list1 中下标从 a 到 b 的全部节点都删除，并将list2 接在被删除节点的位置。
 *
 * 链接：https://leetcode.cn/problems/insert-greatest-common-divisors-in-linked-list/description/
 */
public class Q1669 {

    /**
     * 输入：list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
     * 输出：[10,1,13,1000000,1000001,1000002,5]
     * 解释：我们删除 list1 中下标为 3 和 4 的两个节点，并将 list2 接在该位置。上图中蓝色的边和节点为答案链表。
     */
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur = list1;
        while (a > 1){
            cur = cur.next;
            a--;
        }
        ListNode pre = list2;
        while (pre.next != null){
            pre = pre.next;
        }
        cur.next = list2;
        cur = pre;
        while (b > 0){
            cur = cur.next;
            b--;
        }
        ListNode.printNode(cur);
        return list1;
    }



}
