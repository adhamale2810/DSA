package hashing;

import java.util.*;

public class union
{
static HashSet<Integer> union( int[] A, int[] B )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : A)
			{
				hs.add(i);
			}
		for (int i : B)
			{
				hs.add(i);
			}
		return hs;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Array1: ");
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++)
			{
				A[i] = sc.nextInt();
			}
		System.out.println("Array2: ");
		int m = sc.nextInt();
		int[] B = new int[m];
		for (int i = 0; i < m; i++)
			{
				B[i] = sc.nextInt();
			}
		System.out.println(union(A, B));
	}
}
