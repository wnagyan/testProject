package com.maycur.leetcode.easy.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 1941. 检查是否所有字符出现次数相同
 *
 * @topic 给你一棵二叉搜索树的root，请你 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
 *
 * 链接：https://leetcode-cn.com/problems/increasing-order-search-tree
 */
public class Q897 {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList();
        getValue(root, list);
        TreeNode newRoot = new TreeNode(-1);
        TreeNode oldRoot = newRoot;
        for (int i : list){
            oldRoot.right = new TreeNode(i);
            oldRoot = oldRoot.right;
        }
        return newRoot.right;
    }

    public void getValue(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left != null){
            getValue(root.left, list);
        }
        list.add(root.val);
        if(root.right != null){
            getValue(root.right, list);
        }
    }
}
