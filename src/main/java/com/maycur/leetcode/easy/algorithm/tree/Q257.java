package com.maycur.leetcode.easy.algorithm.tree;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 *
 * @topic 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * 叶子节点 是指没有子节点的节点。
 *
 * 链接：https://leetcode-cn.com/problems/binary-tree-paths/
 */
public class Q257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> treeLoads = new ArrayList<>();
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        while (!CollectionUtils.isEmpty(treeNodes)){

        }


        return treeLoads;
    }
}
