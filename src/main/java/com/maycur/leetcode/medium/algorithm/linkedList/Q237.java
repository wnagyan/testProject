package com.maycur.leetcode.medium.algorithm.linkedList;

/**
 * 237. 删除链表中的节点
 *
 * @topic 有一个单链表的head，我们想删除它其中的一个节点node。
 * 给你一个需要删除的节点node。你将无法访问第一个节点head。
 * 链表的所有值都是 唯一的，并且保证给定的节点node不是链表中的最后一个节点。
 * 删除给定的节点。注意，删除节点并不是指从内存中删除它。这里的意思是：
 *
 *      给定节点的值不应该存在于链表中。
 *      链表中的节点数应该减少 1。
 *      node前面的所有值顺序相同。
 *      node后面的所有值顺序相同。
 *
 * 链接：https://leetcode.cn/problems/delete-node-in-a-linked-list
 */
public class Q237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
