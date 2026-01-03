package LinkedList;

public class Node<T> {
    T data;
    // Creating a reference with className
    Node<T> nextNode;

    Node(T data) {
        this.data = data;
        this.nextNode = null;
    }
}
