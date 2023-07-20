package linkedlist.CircularLinkedList;

public class InsertBeginning {
    public static Node insertBegin(Node head, int d) {
        Node temp = new Node(d);
        if (head == null) {
            temp.next = temp;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            temp.next = head;
            curr.next = temp;
        }
        return temp;
    }

    public static Node efficientInsertBegin(Node head, int d) {
        Node temp = new Node(d);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = head.data;
        head.data = temp.data;
        temp.data = t;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = efficientInsertBegin(head, 10);
        head = efficientInsertBegin(head, 20);
        head = efficientInsertBegin(head, 30);
        Traverse.printList(head);
    }
}
