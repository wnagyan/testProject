package com.maycur.leetcode.medium.algorithm.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 *
 * @topic: 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 *
 * 链接：https://leetcode.cn/problems/binary-tree-level-order-traversal/
 */
public class Q102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null){
            return lists;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Queue<TreeNode> childQueue = new ArrayDeque<>();
            for (TreeNode node : queue){
                list.add(node.val);
            }
            for (TreeNode node : queue){
                if (node.left != null){
                    childQueue.add(node.left);
                }
                if (node.right != null){
                    childQueue.add(node.right);
                }
            }
            queue = childQueue;
            lists.add(list);
        }
        return lists;
    }
}
