public class IsThereACycleInALinkedList {

    public static void main(String[] args) {
        Node<String> linkedList = new Node<>("A");
        linkedList.next = new Node<>("B");
        linkedList.next.next = new Node<>("C");
        linkedList.next.next.next = new Node<>("D");
        linkedList.next.next.next.next = linkedList.next.next.next;
//        linkedList.next.next.next.next.next = new Node<>("F");
//        linkedList.next.next.next.next.next.next = new Node<>("G");
        System.out.println(isThereACycleInTheLinkedList(linkedList));
    }

    private static <T> boolean isThereACycleInTheLinkedList(Node<T> node) {
        if (node == null || node.next == null) {
            return false;
        }
        Node<T> turtle = node;
        Node<T> rabbit = node.next.next;
        while (turtle != null && rabbit != null) {
            if (turtle == rabbit) {
                return true;
            }
            if (rabbit.next != null) {
                turtle = turtle.next;
                rabbit = rabbit.next.next;
            } else {
                return false;
            }
        }
        return false;
    }

    static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }
}
