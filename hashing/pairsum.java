package hashing;

import java.util.*;

public class pairsum
{
static boolean checkPair( int[] arr, int sum )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : arr)
			{
				if (hs.contains(sum - i))
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
		int sum = sc.nextInt();
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.println(checkPair(arr, sum));
	}
}
