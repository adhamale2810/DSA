package linkedlist.Problems;

import linkedlist.SinglyLinkedList.InsertEnd;
import linkedlist.SinglyLinkedList.Node;
import linkedlist.SinglyLinkedList.Traverse;

public class RemoveDuplicates {
    static Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 40);
        head = InsertEnd.insertEnd(head, 40);
        System.out.println("Before:");
        Traverse.printList(head);
        System.out.println("After:");
        head = removeDuplicates(head);
        Traverse.printList(head);
    }
}
