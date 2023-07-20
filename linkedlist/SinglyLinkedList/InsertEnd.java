package linkedlist.SinglyLinkedList;

public class InsertEnd {
    public static Node insertEnd(Node head, int d) {
        Node temp = new Node(d);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        Traverse.printList(head);
    }
}
