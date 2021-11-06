package sorting;

import java.util.*;

public class NaivePartition
{
private static int[] naivePartition( int n, int[] arr, int index )
	{
		int[] temp = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++)
			{
				if (arr[i] <= arr[index])
					{
						temp[k] = arr[i];
						k++;
					}
			}
		for (int i = 0; i < n; i++)
			{
				if (arr[i] > arr[index])
					{
						temp[k] = arr[i];
						k++;
					}
			}
		for (int i = 0; i < n; i++)
			{
				arr[i] = temp[i];
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
		System.out.print("Enter Index: ");
		int index = sc.nextInt();
		System.out.println(Arrays.toString(naivePartition(n, arr, index)));
		sc.close();
	}
}