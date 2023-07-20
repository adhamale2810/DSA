package linkedlist.CircularLinkedList;

public class Traverse {
    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            System.out.println(head.data);
        }
        Node curr = head;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node h1 = new Node(20);
        Node h2 = new Node(30);
        head.next = h1;
        h1.next = h2;
        h2.next = head;
        printList(head);
    }
}
