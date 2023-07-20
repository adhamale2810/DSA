package linkedlist.SinglyLinkedList;

public class DeleteBeginning {
    public static Node deleteBegin(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        System.out.println("Before:");
        Traverse.printList(head);
        head = deleteBegin(head);
        System.out.println("After:");
        Traverse.printList(head);
    }
}
