public class Main {
    public static void main(String[] args) {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);

        System.out.printf("Inorder traversal of binary tree is : %s", binaryTreeInorderTraversal.inorderTraversal(root));
    }
}
