package hashing.problems;
// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1

import java.util.*;

public class union
{
static int doUnion( int a[], int n, int b[], int m )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : a)
			{
				hs.add(i);
			}
		for (int i : b)
			{
				hs.add(i);
			}
		return hs.size();
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
		System.out.println(doUnion(A, n, B, m));
	}
}
