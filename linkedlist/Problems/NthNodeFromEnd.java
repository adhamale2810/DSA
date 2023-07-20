package linkedlist.Problems;

import linkedlist.SinglyLinkedList.InsertEnd;
import linkedlist.SinglyLinkedList.Node;
import linkedlist.SinglyLinkedList.Traverse;

public class NthNodeFromEnd {
    static int nNodeFromEnd(Node head, int n) {
        if (head == null) {
            return -1;
        }
        Node curr = head;
        int c = 0;
        while (curr != null) {
            curr = curr.next;
            c++;
        }
        if (n > c || n <= 0) {
            return -1;
        }
        curr = head;
        for (int i = 0; i < c - n; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        head = InsertEnd.insertEnd(head, 40);
        head = InsertEnd.insertEnd(head, 50);
        System.out.println("List:");
        Traverse.printList(head);
        System.out.println("Nth Node From End: " + nNodeFromEnd(head, 2));
    }
}
