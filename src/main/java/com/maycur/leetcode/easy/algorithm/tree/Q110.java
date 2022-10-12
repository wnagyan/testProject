package com.maycur.leetcode.easy.algorithm.tree;

/**
 * 110. 平衡二叉树
 *
 * @topic 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 *
 * 链接：https://leetcode.cn/problems/balanced-binary-tree/
 */
public class Q110 {

    public boolean isBalanced(TreeNode root) {
        return true;
    }

    public int depthTree(TreeNode treeNode){
        if (treeNode == null){
            return 0;
        }
        return Math.max(depthTree(treeNode.right), depthTree(treeNode.left)) + 1;
    }

    public static void main(String[] args) {

    }
}
