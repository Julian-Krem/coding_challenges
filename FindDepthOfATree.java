import java.util.Arrays;

public class FindDepthOfATree {
    static int dept = -1;
    static int maxDepth = -1;
    static Node lastNodeChecked;

    public static void main(String[] args) {
        Node<Integer> root = new Node(0);
        Node<Integer> node1 = new Node(1);
        Node<Integer> node2 = new Node(2);
        Node<Integer> node3 = new Node(3);
        Node<Integer> node4 = new Node(4);
        Node<Integer> node5 = new Node(5);
        Node<Integer> node6 = new Node(6);
        Node<Integer> node7 = new Node(7);
        Node<Integer> node8 = new Node(8);
        Node<Integer> node9 = new Node(9);
        Node<Integer> node10 = new Node(10);

        root.setLeftChild(node1);
        root.setRightChild(node2);
        node1.setLeftChild(node3);
        node1.setRightChild(node4);
        node2.setLeftChild(node5);
        node2.setRightChild(node6);
        node3.setLeftChild(node9);
        node9.setRightChild(node10);
        node6.setRightChild(node7);
        node7.setLeftChild(node8);

        int[] state = {-1, -1};

        System.out.println(Arrays.toString(findDepthOfTheTree(root, state)));
        System.out.println(lastNodeChecked);
    }

    static int findDepthOfTheTree(Node tree) {
        if (tree == null) {
            return dept;
        }
        dept++;
        /*maxDepth = Math.max(dept, maxDepth);*/
        if (dept > maxDepth) {
            maxDepth = dept;
            lastNodeChecked = tree;
        }
        findDepthOfTheTree(tree.getLeftChild());
        findDepthOfTheTree(tree.getRightChild());
        dept--;
        return maxDepth;
    }

    static int[] findDepthOfTheTree(Node tree, int[] state) {
        if (tree == null) {
            return state;
        }
        state[0]++;
        /*maxDepth = Math.max(dept, maxDepth);*/
        if (state[0] > state[1]) {
            state[1] = state[0];
            lastNodeChecked = tree;
        }
        findDepthOfTheTree(tree.getLeftChild(), state);
        findDepthOfTheTree(tree.getRightChild(), state);
        state[0]--;
        return state;
    }

    static class Node<T> {
        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
