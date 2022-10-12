package com.maycur.leetcode.easy.algorithm.tree;


import com.google.common.collect.Lists;

import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 将标准数组（如下案例，层序遍历得到的list）转为二叉树
     * @param list  [3,9,20,null,null,15,7]
     * @return
     */
    public static TreeNode buildTree(List<Integer> list){
        if (list.size() == 0){
            return null;
        }
        TreeNode root = new TreeNode(list.get(0));
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        int height = depthTree(list.size());
        for (int i = 2; i <= height; i++){
            int begin = (int) Math.pow(2, i-1);
            List<Integer> childList = new ArrayList<>();
            for (int j = begin; j < begin * 2; j++){
                childList.add(list.get(j-1));
            }
            while (!queue.isEmpty()){
                TreeNode node = queue.poll();
                for (int k = 0; k < childList.size(); k += 2){
                    if (childList.get(k) == null){
                        node.left = null;
                    }else {
                        node.left = new TreeNode(childList.get(k));
                    }
                    if (childList.get(k+1) == null){
                        node.right = null;
                    }else {
                        node.right = new TreeNode(childList.get(k+1));
                    }
                }
            }
            for (Integer val : childList){
                if (val == null){
                    continue;
                }
                queue.add(new TreeNode(val));
            }
        }
        return root;
    }

    /**
     * 使用对数换底公式得到数组构成的二叉树的高度
     * @param size
     * @return
     */
    public static int depthTree(Integer size){
        return (int) (Math.log(size)/Math.log(2)) + 1;
    }

    public static void main(String[] args) {
        buildTree(Lists.newArrayList(3,9,20,null,null,15,7));
    }
}
