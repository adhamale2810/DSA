package linkedlist.Problems;

import linkedlist.SinglyLinkedList.Node;
import linkedlist.SinglyLinkedList.Traverse;

public class DeleteNodeByPointer {
    static void deleteNode(Node ptr) {
        ptr.data = ptr.next.data;
        ptr.next = ptr.next.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node d1 = new Node(20);
        Node d2 = new Node(30);
        Node d3 = new Node(40);
        Node d4 = new Node(50);
        head.next = d1;
        d1.next = d2;
        d2.next = d3;
        d3.next = d4;
        System.out.println("Before:");
        Traverse.printList(head);
        System.out.println("After:");
        deleteNode(d2);
        Traverse.printList(head);
    }
}
