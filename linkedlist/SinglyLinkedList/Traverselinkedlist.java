package linkedlist.SinglyLinkedList;

class Traverselinkedlist
{
private static void printLList( Node head )
	{
		Node curr = head;
		while (curr != null)
			{
				System.out.println(curr.data);
				curr = curr.next;
			}
	}
public static void main( String[] args )
	{
		Node head = new Node(10);
		Node d1 = new Node(20);
		Node d2 = new Node(30);
		head.next = d1;
		d1.next = d2;
		printLList(head);
	}
}
