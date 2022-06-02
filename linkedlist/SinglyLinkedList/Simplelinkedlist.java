package linkedlist.SinglyLinkedList;

import java.util.*;

public class Simplelinkedlist
{
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		Node head = new Node(10);
		Node d1 = new Node(20);
		head.next = d1;
		Node d2 = new Node(30);
		d1.next = d2;
	}
}
