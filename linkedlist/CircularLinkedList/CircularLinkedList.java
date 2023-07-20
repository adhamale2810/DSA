package linkedlist.CircularLinkedList;

public class CircularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node h1 = new Node(20);
        Node h2 = new Node(30);
        head.next = h1;
        h1.next = h2;
        h2.next = head;
    }
}
