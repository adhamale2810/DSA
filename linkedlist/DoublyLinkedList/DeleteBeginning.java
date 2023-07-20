package linkedlist.DoublyLinkedList;

public class DeleteBeginning {
    public static Node deleteBegin(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        head = head.next;
        head.prev = null;
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
        head = deleteBegin(head);
        Traverse.printList(head);
    }
}
