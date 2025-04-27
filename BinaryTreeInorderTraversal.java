/*
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> finalResult = new ArrayList<>();
        return inorderTraversal2(root, finalResult);
    }

    public List<Integer> inorderTraversal2(TreeNode root, List<Integer> inorder) {
        if (root == null) {
            return inorder;
        }
        if(root.left != null) {
            inorderTraversal2(root.left, inorder);
        }

        inorder.add(root.val);

        if(root.right != null) {
            inorderTraversal2(root.right, inorder);
        }

        return inorder;
    }

}