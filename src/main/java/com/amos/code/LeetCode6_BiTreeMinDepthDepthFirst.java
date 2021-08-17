package com.amos.code;

/**
 * @Title: LeetCode6_BiTreeMinDepthDepthFirst
 * @Description: 二叉树的最小深度：深度优先算法  时间复杂度：O（n）     空间复杂度：O(logN)
 * 二叉树逻辑结构：
 *          1
 *      2      3
 *   4   5   6
 *          7
 */
public class LeetCode6_BiTreeMinDepthDepthFirst {

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
        //首先判断树是否为空
        if (root == null) {
            System.out.println("二叉树为空");
            return 0;
        }

        //此为叶子节点
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;//这是无穷大
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
        }
        if (root.right != null) {
            min = Math.min(minDepth(root.right), min);
        }
        return min + 1;
    }

    //二叉树的静态内部类
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
