import java.util.ArrayList;
import java.util.List;

public class CheckIfABinarySearchTree {
    public static void main(String[] args) {

        Node<Integer> root = new Node<>(5);
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(40);
        Node<Integer> node0 = new Node<>(0);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node7 = new Node<>(7);
        Node<Integer> node8 = new Node<>(8);
        Node<Integer> node9 = new Node<>(9);
        Node<Integer> node10 = new Node<>(10);

        root.left = node3;
        root.right = node7;
        node3.left = node1;
        node3.right = node4;
        node7.left = node6;
        node7.right = node8;
        node1.left = node0;
        node1.right = node2;
        node8.right = node9;
        node9.right = node10;


        long startTime = System.nanoTime ( );
        System.out.println(ifABinaryTreeIsABinarySearchTree(root));
        long endTime = System.nanoTime ( );
        System.out.println (endTime - startTime);
        System.out.println();
        long startTime1 = System.nanoTime ( );
        System.out.println(isBST(root, null, null));
        long endTime1 = System.nanoTime ( );
        System.out.println (endTime1 - startTime1);


      /*  System.out.println(ifABinaryTreeIsABinarySearchTree(root));

        System.out.println(isBST(root, null, null));*/
    }

    static class Node<T> {
        private final T element;
        private Node<T> left;
        private Node<T> right;

        public Node(T element) {
            this.element = element;
        }
    }

    static List<Integer> inOrderTraversal(Node<Integer> root, List<Integer> list) {

        if (root.left != null) {
            inOrderTraversal(root.left, list);
        }
        list.add(root.element);
        if (root.right != null) {
            inOrderTraversal(root.right, list);
        }
        return list;
    }

    static boolean ifABinaryTreeIsABinarySearchTree(Node<Integer> root) {
        List<Integer> list = new ArrayList<>();
        list = inOrderTraversal(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isBST(Node<Integer> node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.element <= min) || (max != null && node.element >= max)) {
            return false;
        }

        return isBST(node.left, min, node.element) && isBST(node.right, node.element, max);
    }
}
