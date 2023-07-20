package linkedlist.Problems;

import linkedlist.SinglyLinkedList.InsertEnd;
import linkedlist.SinglyLinkedList.Node;
import linkedlist.SinglyLinkedList.Traverse;

public class MidOfLinkedList {
    static int midOfList(Node head) {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            return head.data;
        }
        int c = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            c++;
        }
        curr = head;
        for (int i = 0; i < c / 2; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    static int efficientMidOfList(Node head) {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            return head.data;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
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
        System.out.println("Middle: " + efficientMidOfList(head));
    }
}
