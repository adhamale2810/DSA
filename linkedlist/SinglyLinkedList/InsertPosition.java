package linkedlist.SinglyLinkedList;

public class InsertPosition
{
private static void printLList( Node head )
	{
		Node curr = head;
		while (curr != null)
			{
				System.out.print(curr.data + " ");
				curr = curr.next;
			}
		System.out.println("");
	}
private static Node insertEnd( Node head, int d )
	{
		Node temp = new Node(d);
		if (head == null)
			{
				return temp;
			}
		Node curr = head;
		while (curr.next != null)
			{
				curr = curr.next;
			}
		curr.next = temp;
		return head;
	}
private static Node insertPos( Node head, int pos, int d )
	{
		Node temp = new Node(d);
		if (pos == 1)
			{
				temp.next = head;
				return temp;
			}
		Node curr = head;
		for (int i = 1; i <= pos - 2 && curr != null; i++)
			{
				curr = curr.next;
			}
		if (curr == null)
			{
				return head;
			}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}
public static void main( String[] args )
	{
		Node head = null;
		head = insertEnd(head, 10);
		head = insertEnd(head, 20);
		head = insertEnd(head, 30);
		System.out.println("Linked List:");
		printLList(head);
		head = insertPos(head, 2, 60);
		System.out.println("After Insert:");
		printLList(head);
	}
}
