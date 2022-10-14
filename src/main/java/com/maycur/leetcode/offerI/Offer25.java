package com.maycur.leetcode.offerI;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 *
 * @topic 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 链接：https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 */
public class Offer25 {

    /**
     * 定义一个head和cur，cur进行移动
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                //给cur赋值l1的当前节点，l1指针往后移动
                cur.next = l1;
                l1 = l1.next;
            }else {
                //给cur赋值l2的当前节点，l2指针往后移动
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.buildNode(new int[]{1, 2, 4});
        ListNode l2 = ListNode.buildNode(new int[]{1, 3, 4});
        ListNode.printNode(mergeTwoLists(l1, l2));
    }
}
