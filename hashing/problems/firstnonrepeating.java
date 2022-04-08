package hashing.problems;

// https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1


import java.util.*;

public class firstnonrepeating
{
static int firstNonRepeating( int arr[], int n )
	{
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++)
			{
				if (map.containsKey(arr[i]))
					map.put(arr[i], map.get(arr[i]) + 1);
				else
					map.put(arr[i], 1);

			}
		int ans = 0;
		for (int i = 0; i < n; i++)
			{
				if (map.get(arr[i]) == 1)
					{
						ans = arr[i];
						break;
					}
			}
		return ans;
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
		System.out.println(firstNonRepeating(arr, n));
	}
}
