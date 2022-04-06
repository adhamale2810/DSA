//Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

package searching.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayGivenSum
{
private static ArrayList<Integer> subarraySum( int[] arr, int n, int s )
	{
		ArrayList<Integer> res = new ArrayList<>();
		int start = 0;
		int sum = arr[0];
		for (int i = 1; i <= n; i++)
			{
				while (sum > s && start < i - 1)
					{
						sum -= arr[start];
						start++;
					}
				if (sum == s)
					{
						res.add(start + 1);
						res.add(i);
						return res;
					}
				if (i < n)
					{
						sum += arr[i];
					}
			}
		res.add(- 1);
		return res;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements:");
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.print("Sum: ");
		int s = sc.nextInt();
		ArrayList<Integer> res = subarraySum(arr, n, s);
		System.out.println(res.get(0) + " " + res.get(1));
		sc.close();
	}
}
