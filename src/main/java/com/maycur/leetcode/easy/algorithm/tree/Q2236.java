package com.maycur.leetcode.easy.algorithm.tree;

/**
 * 2236. 判断根结点是否等于子结点之和
 *
 * @topic 给你一个 二叉树 的根结点root，该二叉树由恰好3个结点组成：根结点、左子结点和右子结点。
 * 如果根结点值等于两个子结点值之和，返回true，否则返回false 。
 *
 * 链接：https://leetcode-cn.com/problems/root-equals-sum-of-children/
 */
public class Q2236 {

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
