package hashing.problems;
// https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1/?track=DSASP-Hashing&batchId=154

import java.util.*;

public class zerosubarrays
{
static long findSubarray( long[] arr, int n )
	{
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0, presum = 0;

		for (long i : arr)
			{
				presum += i;
				if (presum == 0)
					{
						count++;
					}
				if (map.containsKey(presum))
					{
						count += map.get(presum);
						map.put(presum, map.get(presum) + 1);
					} else
					map.put(presum, 1);
			}

		return count;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextLong();
			}
		System.out.println(findSubarray(arr, n));
	}
}
