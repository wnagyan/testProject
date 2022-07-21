package com.maycur.leetcode.easy.algorithm.tree;

/**
 * 1725. 可以形成最大正方形的矩形数目
 *
 * @topic 给你一棵 完整二叉树的根，这棵树有以下特征：
 *
 * 叶子节点要么值为0要么值为1，其中0 表示False，1 表示True。
 * 非叶子节点 要么值为 2要么值为 3，其中2表示逻辑或OR ，3表示逻辑与AND。
 * 计算一个节点的值方式如下：
 *
 * 如果节点是个叶子节点，那么节点的 值为它本身，即True或者False。
 * 否则，计算两个孩子的节点值，然后将该节点的运算符对两个孩子值进行 运算。
 * 返回根节点root的布尔运算值。
 *
 * 完整二叉树是每个节点有 0个或者 2个孩子的二叉树。
 * 叶子节点是没有孩子的节点。
 *
 * 链接：https://leetcode.cn/problems/evaluate-boolean-binary-tree
 */
public class Q2331 {

    public boolean evaluateTree(TreeNode root) {
        return buildTree(root);
    }

    /**
     * 简化树结构，从假如只有两层树结构进行思考
     * @param root
     * @return
     */
    public boolean buildTree(TreeNode root){
        if (root.val <= 1){
            return root.val == 1;
        }
        if (root.val == 2){
            return buildTree(root.left) || buildTree(root.right);
        }else {
            return buildTree(root.left) && buildTree(root.right);
        }
    }
}
