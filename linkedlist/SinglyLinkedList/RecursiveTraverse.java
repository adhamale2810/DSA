package linkedlist.SinglyLinkedList;

public class RecursiveTraverse {
    public static void rPrintList(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.println(temp.data);
        rPrintList(temp.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        head.next = n1;
        n1.next = n2;
        rPrintList(head);
    }
}
