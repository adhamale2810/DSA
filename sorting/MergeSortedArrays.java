package sorting;

import java.util.*;

public class MergeSortedArrays
{
private static void merge( int[] a, int[] b )
	{
		int i = 0, j = 0;
		int m = a.length;
		int n = b.length;
		while (i < m && j < n)
			{
				if (a[i] <= b[j])
					{
						System.out.print(a[i] + " ");
						i++;
					} else
					{
						System.out.print(b[j] + " ");
						j++;
					}
			}
		while (i < m)
			{
				System.out.print(a[i] + " ");
				i++;
			}
		while (j < n)
			{
				System.out.print(b[j] + " ");
				j++;
			}
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
		int[] arr2 = {5, 50, 50};
		merge(arr1, arr2);
		sc.close();
	}
}