public class ReversingLinkedList {

    public static void main(String[] args) {

//        LinkedList<String> list = new LinkedList<>();
//        list.addFirst("A");
//        list.addFirst("B");
//        list.addFirst("C");
//        list.addFirst("D");
//        list.addFirst("E");
//        list.addFirst("F");
//        list.addFirst("G");
//
//        System.out.println(list);
//
//        /*G, F, E, D, C, B, A*/
//
//        Stack<String> stack = new Stack<>();
//        while (!list.isEmpty()) {
//            stack.push(list.pop());
//        }
//
//        /*G, F, E, D, C, B, A*/
//
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop() + " ");
//        }
//
//        System.out.println();

         /*curr       next  */
        /* [A] -> [B]-> [C]-> [D]-> NULL */

        Node<String> linkedList = new Node<>("A");
        linkedList.next = new Node<>("B");
        linkedList.next.next = new Node<>("C");
        linkedList.next.next.next = new Node<>("D");
        linkedList.next.next.next.next = new Node<>("E");
        linkedList.next.next.next.next.next = new Node<>("F");
        linkedList.next.next.next.next.next.next = new Node<>("G");

        Node<String> prev = reverseLinkedList(linkedList);

        while (prev != null) {
            System.out.println(prev.value);
            prev = prev.next;
        }
    }

    private static <T> Node reverseLinkedList(Node<T> node) {
        Node<T> prev = null;
        Node<T> current = node;
        Node<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    static class Node<T> {
        T value ;
        Node<T> next;

        Node (T value) {
            this.value = value;
        }
    }
}
