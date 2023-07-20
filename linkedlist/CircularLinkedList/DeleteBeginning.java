package linkedlist.CircularLinkedList;

public class DeleteBeginning {
    public static Node deleteBegin(Node head) {
        if (head == null || head.next == head) {
            return null;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }

    public static Node efficientDeleteBegin(Node head) {
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.efficientInsertEnd(head, 10);
        head = InsertEnd.efficientInsertEnd(head, 20);
        head = InsertEnd.efficientInsertEnd(head, 30);
        System.out.println("Before:");
        Traverse.printList(head);
        System.out.println("After:");
        head = efficientDeleteBegin(head);
        Traverse.printList(head);
    }
}
