package sorting;

import java.util.*;

public class InversionsInArray
{
private static int inversions( int n, int[] arr )
	{
		int c = 0;
		for (int i = 0; i < n - 1; i++)
			{
				for (int j = i + 1; j < n; j++)
					{
						if (arr[i] > arr[j])
							{
								c++;
							}
					}
			}
		return c;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Numbers: ");
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.println(inversions(n, arr));
		sc.close();
	}
}