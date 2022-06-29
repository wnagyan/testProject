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
        List<String> treePaths = new ArrayList<>();
        buildRoad(root, "", treePaths);
        return treePaths;
    }

    public void buildRoad(TreeNode root, String path, List<String> paths){
        if (root != null){
            StringBuilder stringBuilder = new StringBuilder(path);
            //保存每次递归的节点值
            stringBuilder.append(root.val);
            if(root.left == null && root.right == null){
                //当递归到叶子节点时，将路径加入到list中
                paths.add(stringBuilder.toString());
            }else {
                //如果不是叶子节点，继续左右节点递归
                stringBuilder.append("->");
                buildRoad(root.left, stringBuilder.toString(), paths);
                buildRoad(root.right, stringBuilder.toString(), paths);
            }
        }
    }
}
