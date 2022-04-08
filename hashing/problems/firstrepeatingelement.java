package hashing.problems;
// https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1/?track=DSASP-Hashing&batchId=154

import java.util.*;

public class firstrepeatingelement
{
static int firstRepeated( int[] arr, int n )
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++)
			{
				if (hm.containsKey(arr[i]))
					{
						res = Math.min(res, hm.get(arr[i]));
					}
				hm.put(arr[i], i);
			}
		if (res == Integer.MAX_VALUE)
			{
				return - 1;
			} else
			{
				return res + 1;
			}
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
		System.out.println(firstRepeated(arr, n));
	}
}
