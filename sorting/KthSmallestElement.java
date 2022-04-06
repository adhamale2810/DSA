package sorting;

import java.util.*;

public class KthSmallestElement
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
		return j - 1;
	}
private static int[] quickSort( int[] arr, int low, int high )
	{
		if (low >= high)
			{
				return arr;
			}
		int pi = partition(arr, high, low, high);
		quickSort(arr, low, pi - 1);
		quickSort(arr, pi + 1, high);
		return arr;
	}
private static int smallestElement( int[] arr, int k )
	{
		quickSort(arr, 0, arr.length - 1);
		return arr[k - 1];
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Elements:");
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.print("Value of k: ");
		int k = sc.nextInt();
		System.out.println("Kth Smallest Element: " + smallestElement(arr, k));
		sc.close();
	}
}