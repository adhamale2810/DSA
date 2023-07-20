package linkedlist.SinglyLinkedList;

public class Search {
    static int search(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            }
            curr = curr.next;
            pos++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertEnd.insertEnd(head, 10);
        head = InsertEnd.insertEnd(head, 20);
        head = InsertEnd.insertEnd(head, 30);
        head = InsertEnd.insertEnd(head, 40);
        System.out.println(search(head, 10));
    }
}
