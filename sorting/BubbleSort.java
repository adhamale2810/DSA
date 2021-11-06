package sorting;

import java.util.*;

class BubbleSort
{
private static int[] bubbleSort( int n, int[] arr )
	{
		boolean swapped;
		for (int i = 0; i < n - 1; i++)
			{
				swapped = false;
				for (int j = 0; j < n - i - 1; j++)
					{
						if (arr[j] > arr[j + 1])
							{
								int t = arr[j];
								arr[j] = arr[j + 1];
								arr[j + 1] = t;
								swapped = true;
							}
					}
				if (swapped == false)
					{
						break;
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
		System.out.println(Arrays.toString(bubbleSort(n, arr)));
		sc.close();
	}
}