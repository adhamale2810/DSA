package sorting;

import java.util.*;

public class ArrayPartition
{
private static void swap( int[] arr, int i, int j )
	{
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
private static int[] lomutoPartition( int p, int n, int[] arr )
	{
		int i = 0, j = 0;
		while (i < n)
			{
				if (i == p)
					{
						i++;
					}
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
		swap(arr, p, j);
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
		System.out.print("Enter Pivot Index:");
		int p = sc.nextInt();
		System.out.println(Arrays.toString(lomutoPartition(p, n, arr)));
		sc.close();
	}
}