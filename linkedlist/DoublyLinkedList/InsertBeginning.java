package linkedlist.DoublyLinkedList;

public class InsertBeginning {
    static Node insertBegin(Node head, int d) {
        Node temp = new Node(d);
        if (head == null) {
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head, 10);
        head = insertBegin(head, 20);
        head = insertBegin(head, 30);
        Traverse.printList(head);
    }
}
