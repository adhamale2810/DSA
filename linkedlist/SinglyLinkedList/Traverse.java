package linkedlist.SinglyLinkedList;

public class Traverse {
    public static void printList(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        head.next = n1;
        n1.next = n2;
        printList(head);
    }
}