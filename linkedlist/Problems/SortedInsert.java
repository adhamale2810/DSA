package linkedlist.Problems;

import linkedlist.SinglyLinkedList.InsertEnd;
import linkedlist.SinglyLinkedList.Node;
import linkedlist.SinglyLinkedList.Traverse;

public class SortedInsert {
    static Node sortedInsert(Node head, int x) {
        Node temp = new Node(x);
        Node curr = head;
        if (head == null) {
            return temp;
        }
        if (head.data > x) {
            temp.next = head;
            return temp;
        }
        while (curr.next != null && x > curr.next.data) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        System.out.println("Before:");
        Traverse.printList(head);
        head = sortedInsert(head, 35);
        System.out.println("After:");
        Traverse.printList(head);
    }
}
