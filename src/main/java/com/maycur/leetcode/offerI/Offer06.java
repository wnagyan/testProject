package com.maycur.leetcode.offerI;

import java.util.*;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * @topic: 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 链接：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
 */
public class Offer06 {

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int length = 0;
        while (head != null){
            System.out.println(head.next + ":" + head.val);
            stack.push(head.val);
            length++;
            head = head.next;
        }
        int[] nums = new int[length];
        for (int i = 0; i < length; i++){
            nums[i] = stack.pop();
        }
        return nums;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}

