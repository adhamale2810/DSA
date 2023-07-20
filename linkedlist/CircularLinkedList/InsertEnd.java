package linkedlist.CircularLinkedList;

public class InsertEnd {
    public static Node insertEnd(Node head, int d) {
        Node temp = new Node(d);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }

    public static Node efficientInsertEnd(Node head, int d) {
        Node temp = new Node(d);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = temp.data;
        temp.data = head.data;
        head.data = t;
        return temp;
    }

    public static void main(String[] args) {
        Node head = null;
        head = efficientInsertEnd(head, 10);
        head = efficientInsertEnd(head, 20);
        head = efficientInsertEnd(head, 30);
        Traverse.printList(head);
    }
}
