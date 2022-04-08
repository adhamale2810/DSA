package hashing.problems;
// https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

import java.util.*;

public class subarrayzerosum
{
static boolean findsum( int arr[], int n )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int presum = 0;
		for (int i : arr)
			{
				presum += i;
				if (presum == 0)
					{
						return true;
					}
				if (hs.contains(presum))
					{
						return true;
					}
				hs.add(presum);
			}
		return false;
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
		System.out.println(findsum(arr, n));
	}
}
