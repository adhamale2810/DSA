package hashing.problems;
// https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1/?track=DSASP-Hashing&batchId=154

import java.util.*;

public class equalarrays
{
static boolean check( long A[], long B[], int N )
	{
		HashMap<Long, Integer> hma = new HashMap<Long, Integer>();
		HashMap<Long, Integer> hmb = new HashMap<Long, Integer>();
		for (long i : A)
			{
				if (hma.containsKey(i))
					{
						hma.put(i, hma.get(i) + 1);
					} else
					{
						hma.put(i, 1);
					}
			}
		for (long i : B)
			{
				if (hmb.containsKey(i))
					{
						hmb.put(i, hmb.get(i) + 1);
					} else
					{
						hmb.put(i, 1);
					}
			}
		for (long i : A)
			{
				if (! hma.containsKey(i) && ! hmb.containsKey(i))
					{
						return false;
					} else
					{
						if (hma.get(i) != hmb.get(i))
							{
								return false;
							}
					}
			}
		return true;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		System.out.println("Array 1:");
		long[] A = new long[n];
		for (int i = 0; i < n; i++)
			{
				A[i] = sc.nextLong();
			}
		System.out.println("Array 2:");
		long[] B = new long[n];
		for (int i = 0; i < n; i++)
			{
				B[i] = sc.nextLong();
			}
		System.out.println(check(A, B, n));
	}
}
