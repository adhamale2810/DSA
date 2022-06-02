package linkedlist.SinglyLinkedList;

import java.util.*;

public class InsertBeginning
{
private static void printList( Node head )
	{
		Node curr = head;
		while (curr != null)
			{
				System.out.println(curr.data);
				curr = curr.next;
			}
	}
private static Node insertBegin( Node head, int d )
	{
		Node temp = new Node(d);
		temp.next = head;
		return temp;
	}
public static void main( String[] args )
	{
		Node head = null;
		head = insertBegin(head, 10);
		head = insertBegin(head, 20);
		head = insertBegin(head, 30);
		printList(head);
	}
}
