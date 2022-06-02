package linkedlist.SinglyLinkedList;

public class DeleteEnd
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
private static Node deleteEnd( Node head )
	{
		if (head == null)
			{
				return null;
			}
		if (head.next == null)
			{
				head = null;
				return head;
			}
		Node curr = head;
		while (null != curr.next.next)
			{
				curr = curr.next;
			}
		curr.next = null;
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
		System.out.println("After Delete:");
		head = deleteEnd(head);
		printLList(head);
	}
}
