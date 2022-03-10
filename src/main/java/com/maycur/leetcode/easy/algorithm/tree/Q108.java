package com.maycur.leetcode.easy.algorithm.tree;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * @topic: 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 *
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 */
public class Q108 {

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
    }

    /**
     * 思路：递归构建树，因为数组是增量递增的，所以取中间值作为平衡二叉树的根节点，围绕根节点构建二叉树，
     *      当数组左边大于右边下标时，说明已经无法构建二叉树了，所以此时返回null
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(0, nums.length - 1, nums);
    }

    public TreeNode buildTree(int left, int right, int[] nums){
        if(left > right){
            return null;
        }
        int mid = (right + left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(left, mid-1, nums);
        root.right = buildTree(mid+1, right, nums);
        return root;
    }
}
