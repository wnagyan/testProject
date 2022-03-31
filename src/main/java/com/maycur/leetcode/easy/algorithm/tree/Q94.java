package com.maycur.leetcode.easy.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * @topic 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 *
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 */
public class Q94 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        buildTree(root);
        return list;
    }

    public void buildTree(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left != null){
            buildTree(root.left);
        }
        if(root.right != null){
            buildTree(root.right);
        }
    }

}
