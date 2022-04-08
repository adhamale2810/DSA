package hashing.problems;
// https://practice.geeksforgeeks.org/problems/key-pair5616/1

import java.util.*;

public class keypair
{
static boolean hasArrayTwoCandidates( int arr[], int n, int x )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : arr)
			{
				if (hs.contains(x - i))
					{
						return true;
					}
				hs.add(i);
			}
		return false;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int x = sc.nextInt();
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.println(hasArrayTwoCandidates(arr, n, x));
	}
}
