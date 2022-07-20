package com.maycur.leetcode.medium.algorithm.linkedList;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {};
    ListNode(int x) {
        val = x;
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode buildNode(int[] values){
        ListNode head = new ListNode(values[0]);
        ListNode pre = head;
        for (int i = 1; i < values.length; i++){
            ListNode cur = new ListNode(values[i]);
            head.next = cur;
            head = head.next;
        }
        return pre;
    }

    public static void printNode(ListNode head){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

}
