package linkedlist.Problems;

import linkedlist.SinglyLinkedList.InsertEnd;
import linkedlist.SinglyLinkedList.Node;
import linkedlist.SinglyLinkedList.Traverse;

import java.util.ArrayList;

public class ReverseLinkedList {
    static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            arr.add(curr.data);
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            curr.data = arr.remove(arr.size() - 1);
            curr = curr.next;
        }
        return head;
    }

    static Node efficientReverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        head = InsertEnd.insertEnd(head, 40);
        head = InsertEnd.insertEnd(head, 50);
        System.out.println("Before:");
        Traverse.printList(head);
        head = efficientReverseLinkedList(head);
        System.out.println("After:");
        Traverse.printList(head);
    }
}
