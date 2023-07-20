package linkedlist.DoublyLinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node h1 = new Node(20);
        Node h2 = new Node(30);
        head.next = h1;
        h1.prev = head;
        h1.next = h2;
        h2.prev = h1;
    }
}
