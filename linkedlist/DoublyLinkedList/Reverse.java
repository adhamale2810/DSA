package linkedlist.DoublyLinkedList;

public class Reverse {
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node t = null;
        while (curr != null) {
            t = curr.prev;
            curr.prev = curr.next;
            curr.next = t;
            curr = curr.prev;
        }
        return t.prev;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        System.out.println("Before:");
        Traverse.printList(head);
        System.out.println("After:");
        head = reverse(head);
        Traverse.printList(head);
    }
}
