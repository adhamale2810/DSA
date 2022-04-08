package hashing.problems;

// https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1

import java.util.*;

public class intersection
{
static int NumberofElementsInIntersection( int a[], int b[], int n, int m )
	{
		int c = 0;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : a)
			{
				hs.add(i);
			}
		for (int i : b)
			{
				if (hs.contains(i))
					{
						c++;
						hs.remove(i);
					}
			}
		return c;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Array 1:");
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++)
			{
				A[i] = sc.nextInt();
			}
		System.out.println("Array 2:");
		int m = sc.nextInt();
		int[] B = new int[m];
		for (int i = 0; i < m; i++)
			{
				B[i] = sc.nextInt();
			}
		System.out.println(NumberofElementsInIntersection(A, B, n, m));
	}
}
