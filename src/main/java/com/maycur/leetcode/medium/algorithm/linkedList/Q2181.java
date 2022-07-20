package com.maycur.leetcode.medium.algorithm.linkedList;

/**
 * 2181. 合并零之间的节点
 *
 * @topic 给你一个链表的头节点 head ，该链表包含由 0 分隔开的一连串整数。链表的 开端 和 末尾 的节点都满足 Node.val == 0 。
 *
 * 对于每两个相邻的 0 ，请你将它们之间的所有节点合并成一个节点，其值是所有已合并节点的值之和。然后将所有 0 移除，修改后的链表不应该含有任何 0 。
 * 返回修改后链表的头节点 head 。
 *
 * 链接：https://leetcode.cn/problems/merge-nodes-in-between-zeros
 */
public class Q2181 {

    public static void main(String[] args) {
        ListNode head = ListNode.buildNode(new int[]{0, 3, 1, 0, 4, 5, 2, 0});
        ListNode.printNode(mergeNodes(head));
    }

    public static ListNode mergeNodes(ListNode head) {
        //双指针指向同一个对象时，改动其中一个指针，另一个指针的值也会变动
        //所以需要先对cur.next赋值，此时newHead指针也也会改动
        //再将cur指针移到下一个点cur.next
        ListNode newHead = new ListNode();
        ListNode cur = newHead;
        int sum = 0;
        head = head.next;
        while (head != null){
            if (head.val == 0 && sum != 0){
                ListNode pre = new ListNode(sum);
                cur.next = pre;
                cur = cur.next;
                sum = 0;
            }else {
                sum += head.val;
            }
            head = head.next;
        }
        return newHead.next;
    }
}
