package com.maycur.leetcode.medium.algorithm.tree;

import java.util.*;

/**
 * 101. 对称二叉树
 *
 * @topic: 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 *
 * 链接：https://leetcode.cn/problems/symmetric-tree/
 */
public class Q101 {

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null){
            return true;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                    list.add(node.left.val);
                }else {
                    list.add(null);
                }
                if (node.right != null){
                    queue.add(node.right);
                    list.add(node.right.val);
                }else {
                    list.add(null);
                }
            }
            int listSize = list.size();
            for (int i = 0; i < listSize; i++){
                if(list.get(i) != list.get(listSize-i-1)){
                    return false;
                }
            }
        }
        return true;
    }
}
