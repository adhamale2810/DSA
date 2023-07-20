package sorting;

import java.util.*;

public class QuickSort
{
private static void swap( int[] arr, int i, int j )
	{
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
private static int partition( int[] arr, int p, int low, int high )
	{
		int i = low, j = low;
		while (i <= high)
			{
				if (arr[i] > arr[p])
					{
						i++;
					} else
					{
						swap(arr, i, j);
						i++;
						j++;
					}
			}
		return ( j - 1 );
	}
private static int[] quickSort( int low, int high, int[] arr )
	{
		if (low >= high)
			{
				return arr;
			}
		int pivot = high;
		int pi = partition(arr, pivot, low, high);
		quickSort(low, pi - 1, arr);
		quickSort(pi + 1, high, arr);
		return arr;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Numbers:");
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.println(Arrays.toString(quickSort(0, n - 1, arr)));
		sc.close();
	}
}