package linkedlist.SinglyLinkedList;

public class InsertAtPosition {
    public static Node insertAtPos(Node head, int d, int pos) {
        if (head == null || pos == 0) {
            return null;
        }
        Node temp = new Node(d);
        Node curr = head;
        if (pos == 1) {
            temp.next = curr;
            head = temp;
            return head;
        }
        int c = 1;
        while (curr.next != null && c < pos - 1) {
            curr = curr.next;
            c++;
        }
        Node t = curr.next;
        curr.next = temp;
        temp.next = t;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        System.out.println("Before:");
        Traverse.printList(head);
        System.out.println("After:");
        head = insertAtPos(head, 40, 3);
        Traverse.printList(head);
    }
}
