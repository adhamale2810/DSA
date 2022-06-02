package linkedlist.SinglyLinkedList;

public class RecursiveTraversal
{
private static void rPrinList( Node head )
	{
		if (head == null)
			{
				return;
			}
		System.out.println(head.data);
		rPrinList(head.next);
	}
public static void main( String[] args )
	{
		Node head = new Node(10);
		Node d1 = new Node(20);
		Node d2 = new Node(30);
		Node d3 = new Node(40);
		head.next = d1;
		d1.next = d2;
		d2.next = d3;
		rPrinList(head);
	}
}
