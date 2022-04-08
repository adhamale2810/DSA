package hashing.problems;
// https://practice.geeksforgeeks.org/problems/print-distinct-elements-1587115620/1/?track=DSASP-Hashing&batchId=154

import java.util.*;

public class printnonrepeating
{
static ArrayList<Integer> printNonRepeated( int arr[], int n )
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i : arr)
			{
				if (hm.containsKey(i) == false)
					{
						hm.put(i, 1);
					} else
					{
						hm.put(i, hm.get(i) + 1);
					}
			}
		for (int i : arr)
			{
				if (hm.get(i) == 1)
					{
						res.add(i);
					}
			}
		return res;
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
		System.out.println(printNonRepeated(arr, n));
	}
}
