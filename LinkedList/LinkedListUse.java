package LinkedList;

import java.util.Scanner;

public class LinkedListUse<T> {
    static Node<Integer> head;

    public static void takeInput(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<Integer> temp = head;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = newNode;

    }

    static void printValues() {
        // Never change the head, because it is the starting point to the linked list
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }
    }

    static void insertMiddle(int data, int idx) {
        Node<Integer> newNode = new Node<Integer>(data);
        Node<Integer> temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.nextNode;
            i++;
        }
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        @SuppressWarnings("unused")
        LinkedListUse<Integer> list = new LinkedListUse<Integer>();

        System.out.println("Enter No. of elements: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int data = scan.nextInt();
            LinkedListUse.takeInput(data);
        }
        scan.close();

        LinkedListUse.printValues();
        LinkedListUse.insertMiddle(9, 2);

    }
}
