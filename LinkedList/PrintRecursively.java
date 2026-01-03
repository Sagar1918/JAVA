package LinkedList;

public class PrintRecursively {
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = null; // last node will be null

        return n1;
    }

    static void printRecursively(Node<Integer> head) {
        // Base case
        if (head == null) {
            return;
        }
        // printRecursively(head.nextNode); // Here, it points to nextNode, print in
        // reverse order from last node to first node
        System.out.print(head.data + " ");
        printRecursively(head.nextNode);
    }

    public static void main(String[] args) {

        Node<Integer> head = createLinkedList();

        printRecursively(head);

    }
}
