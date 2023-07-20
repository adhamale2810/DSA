package linkedlist.SinglyLinkedList;

public class InsertBeginning {
    public static Node insertBegin(Node head, int d) {
        Node temp = new Node(d);
        if (head == null) {
            return temp;
        }
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head, 10);
        head = insertBegin(head, 20);
        Traverse.printList(head);
    }
}