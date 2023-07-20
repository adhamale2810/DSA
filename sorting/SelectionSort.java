package sorting;

import java.util.*;

public class SelectionSort
{
private static int[] selectionSort( int n, int[] arr )
	{
		for (int i = 0; i < n-1; i++)
			{
				int min = i;
				for (int j = i+1; j < n; j++)
					{
						min = arr[j] < arr[min] ? j : min;
					}
				int t = arr[min];
				arr[min] = arr[i];
				arr[i] = t;
			}
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
		System.out.println(Arrays.toString(selectionSort(n, arr)));
		sc.close();
	}
}