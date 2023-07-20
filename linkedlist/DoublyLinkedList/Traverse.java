package linkedlist.DoublyLinkedList;

public class Traverse {
    public static void printList(Node head) {
        Node curr = head;
        if (curr == null) {
            return;
        }
        while (curr != null) {
//            System.out.println(curr.prev);
            System.out.println(curr.data);
//            System.out.println(curr.next);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node h1 = new Node(20);
        Node h2 = new Node(30);
        head.next = h1;
        h1.prev = head;
        h1.next = h2;
        h2.prev = h1;
        printList(head);
    }
}
