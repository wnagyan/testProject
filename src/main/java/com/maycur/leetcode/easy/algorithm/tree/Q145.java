package com.maycur.leetcode.easy.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 *
 * @topic 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 *
 * 链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal
 */
public class Q145 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        BuildTree(root);
        return list;
    }

    public void BuildTree(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null){
            BuildTree(root.left);
        }
        if (root.right != null){
            BuildTree(root.right);
        }
        list.add(root.val);
    }

}
