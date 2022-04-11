package hashing.problems;
// https://practice.geeksforgeeks.org/problems/positive-negative-pair5209/1

import java.util.*;

public class posnegpair
{
static ArrayList<Integer> findPairs( int arr[], int n )
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < n; i++)
			{
				hs.add(arr[i]);
				if (arr[i] != 0 && hs.contains(arr[i]) && hs.contains(- arr[i]))
					{
						if (arr[i] > 0)
							{
								res.add(- arr[i]);
								res.add(arr[i]);
							} else
							{
								res.add(arr[i]);
								res.add(- arr[i]);
							}
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
		System.out.println(findPairs(arr, n));
	}
}
