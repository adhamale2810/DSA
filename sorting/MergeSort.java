package sorting;

import java.util.*;

public class MergeSort
{

private static int[] merge( int[] a, int[] b )
	{
		int[] res = new int[a.length + b.length];
		int i = 0, j = 0;
		int k = 0;
		while (i < a.length && j < b.length)
			{
				if (a[i] < b[j])
					{
						res[k] = a[i];
						i++;
					} else
					{
						res[k] = b[j];
						j++;
					}
				k++;
			}
		while (i < a.length)
			{
				res[k] = a[i];
				i++;
				k++;
			}
		while (j < b.length)
			{
				res[k] = b[j];
				j++;
				k++;
			}
		return res;
	}
private static int[] mergeSort( int[] arr, int low, int high )
	{
		if (low == high)
			{
				int[] ba = new int[1];
				ba[0] = arr[low];
				return ba;
			}
		int mid = ( low + high ) / 2;
		int[] fhalf = mergeSort(arr, low, mid);
		int[] shalf = mergeSort(arr, mid + 1, high);
		int[] full = merge(fhalf, shalf);
		return full;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Numbers:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println(Arrays.toString(mergeSort(arr, 0, n - 1)));
		sc.close();
	}
}