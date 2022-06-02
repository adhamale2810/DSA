package linkedlist.SinglyLinkedList;

public class Search
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
private static int searchLL( Node head, int x )
	{
		Node curr = head;
		int pos = 1;
		while (curr != null)
			{
				if (curr.data == x)
					{
						return pos;
					}
				curr = curr.next;
				pos++;
			}
		return - 1;
	}
public static void main( String[] args )
	{
		Node head = null;
		head = insertEnd(head, 10);
		head = insertEnd(head, 20);
		head = insertEnd(head, 30);
		System.out.println("Linked List:");
		printLList(head);
		System.out.println(searchLL(head, 30));
	}
}
