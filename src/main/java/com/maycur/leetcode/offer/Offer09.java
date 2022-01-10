package com.maycur.leetcode.offer;

import javax.annotation.meta.When;
import java.util.Iterator;
import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * @topic: 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 */
public class Offer09 {

    private Stack<Integer> stackA;
    private Stack<Integer> stackB;

    public Offer09() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void appendTail(int value) {
        stackA.push(value);
    }

    public int deleteHead() {
        int num = -1;
        if(stackB.isEmpty()){
            while (!stackA.isEmpty()){
                stackB.push(stackA.pop());
            }
        }
        if(!stackB.isEmpty()){
            num = stackB.pop();
        }
        return num;
    }

}
