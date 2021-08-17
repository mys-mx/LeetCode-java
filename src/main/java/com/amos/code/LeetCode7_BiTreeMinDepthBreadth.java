package com.amos.code;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Title: LeetCode7_BiTreeMinDepthBreadth
 * @Description: 二叉树的最小深度：广度优先  时间复杂度：O（n）  空间复杂度：O（n）
 * 二叉树逻辑结构：
 *          1
 *      2      3
 *   4   5   6
 *          7
 */
public class LeetCode7_BiTreeMinDepthBreadth {
    public static void main(String[] args) {
        //构建一颗二叉树
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, node7, null);
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, node6, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);

        System.out.println(minDepth(node1));
    }

    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList();
        root.deep = 1;
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) {
                return node.deep;
            }
            if (node.left != null) {
                node.left.deep = node.deep + 1;
                queue.offer(node.left);
            }

            if (node.right != null) {
                node.right.deep = node.deep + 1;
                queue.offer(node.right);
            }
        }
        return 0;
    }

    //二叉树的静态内部类
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        int deep;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
