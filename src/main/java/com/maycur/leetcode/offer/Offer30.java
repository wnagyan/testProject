package com.maycur.leetcode.offer;

import java.util.Stack;

/**
 * 剑指 Offer 30. 包含min函数的栈
 * @topic: 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 * 链接：https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof
 */
public class Offer30 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Offer30() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
            return;
        }
        if (minStack.peek() > x){
            minStack.push(x);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
