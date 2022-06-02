package linkedlist.SinglyLinkedList;

public class DeleteBeginning
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
private static Node insertBegin( Node head, int d )
	{
		Node temp = new Node(d);
		temp.next = head;
		return temp;
	}
private static Node deleteBegin( Node head )
	{
		if (head == null)
			{
				return head;
			} else
			{
				return head.next;
			}
	}
public static void main( String[] args )
	{
		Node head = null;
		head = insertBegin(head, 10);
		head = insertBegin(head, 20);
		head = insertBegin(head, 30);
		System.out.println("Linked List:");
		printLList(head);
		System.out.println("After Delete:");
		head = deleteBegin(head);
		printLList(head);
	}
}
