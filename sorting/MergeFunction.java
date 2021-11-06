package sorting;

import java.util.*;

public class MergeFunction
{
private static int[] function( int n, int[] arr, int low, int mid, int high )
	{
		int lsize = mid - low + 1;
		int rsize = high - mid;
		int[] left = new int[lsize];
		int[] right = new int[rsize];
		// Setting up Auxiliary Arrays
		for (int i = 0; i < lsize; i++)
			{
				left[i] = arr[low + i];
			}
		for (int j = 0; j < rsize; j++)
			{
				right[j] = arr[lsize + j];
			}
		//Merging Arrays
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < lsize && j < rsize)
			{
				if (left[i] <= right[j])
					{
						arr[count] = left[i];
						count++;
						i++;
					} else
					{
						arr[count] = right[j];
						count++;
						j++;
					}
			}
		while (i < lsize)
			{
				arr[count] = left[i];
				count++;
				i++;
			}
		while (j < rsize)
			{
				arr[count] = right[j];
				count++;
				j++;
			}
		return arr;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		System.out.println("Enter Numbers:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.print("Enter lower bound: ");
		int low = sc.nextInt();
		System.out.print("Enter mid: ");
		int mid = sc.nextInt();
		System.out.print("Enter upper bound: ");
		int high = sc.nextInt();
		System.out.println(Arrays.toString(function(n, arr, low, mid, high)));
		sc.close();
	}
}