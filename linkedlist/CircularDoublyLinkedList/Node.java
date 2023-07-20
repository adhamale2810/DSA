package linkedlist.CircularDoublyLinkedList;

public class Node {
    Node prev;
    int data;
    Node next;

    Node(int d) {
        prev = null;
        data = d;
        next = null;
    }
}
