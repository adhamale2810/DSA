package linkedlist.DoublyLinkedList;

public class DeleteEnd {
    public static Node deleteEnd(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        System.out.println("Before:");
        Traverse.printList(head);
        System.out.println("After:");
        head = deleteEnd(head);
        Traverse.printList(head);
    }
}
