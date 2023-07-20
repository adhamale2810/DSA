package linkedlist.CircularLinkedList;

public class DeleteKth {
    public static Node deleteKth(Node head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            return DeleteBeginning.deleteBegin(head);
        }
        Node curr = head;
        int c = 1;
        while (c != k - 1) {
            curr = curr.next;
            c++;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        head = InsertEnd.insertEnd(head, 40);
        System.out.println("Before:");
        Traverse.printList(head);
        System.out.println("After:");
        head = deleteKth(head, 1);
        Traverse.printList(head);
    }
}
