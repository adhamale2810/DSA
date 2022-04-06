package hashing;

import java.util.*;

public class countdistinct
{
static int count( int[] arr )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
			{
				hs.add(arr[i]);
			}
		return hs.size();
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.println("Count of Distinct Elements: " + count(arr));
	}
}
