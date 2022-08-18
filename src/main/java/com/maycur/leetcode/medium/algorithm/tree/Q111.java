package com.maycur.leetcode.medium.algorithm.tree;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

/**
 * 111. 二叉树的最小深度
 *
 * @topic: 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明：叶子节点是指没有子节点的节点。
 *
 * 链接：https://leetcode.cn/problems/minimum-depth-of-binary-tree/
 */
public class Q111 {

    public int minDepth(TreeNode root) {
        int depth = Integer.MAX_VALUE;
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null){
            return 0;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            int newDepth = 1;
            for (int i = 0; i < len; i++){
                TreeNode node = queue.poll();
                if (node.left == null || node.right == null){
                    return Math.min(depth, newDepth);
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                newDepth++;
            }
            depth = Math.min(depth, newDepth);
        }
        return depth;
    }

    public int minDepth1(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.right == null && root.left == null){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null){
            System.out.println(root.left.val);
            min = Math.min(minDepth1(root.left), min);
        }
        if (root.right != null){
            System.out.println(root.right.val);
            min = Math.min(minDepth1(root.right), min);
        }
        return min + 1;
    }
}
