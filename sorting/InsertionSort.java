package sorting;

import java.util.*;

public class InsertionSort
{
private static int[] insertionSort( int n, int[] arr )
	{
		for (int i = 1; i < n; i++)
			{
				for (int j = i - 1; j >= 0; j--)
					{
						if (arr[j] > arr[j + 1])
							{
								int t = arr[j];
								arr[j] = arr[j + 1];
								arr[j + 1] = t;
							} else
							{
								break;
							}
					}
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
		System.out.println(Arrays.toString(insertionSort(n, arr)));
		sc.close();
	}
}