package sorting;

import java.util.*;

public class IntersectionSortedArrays
{

private static void intersection( int[] a, int[] b )
	{
		int m = a.length;
		int n = a.length;
		int i = 0, j = 0;
		while (i < m && j < n)
			{
				if (i > 0 && a[i] == a[i - 1])
					{
						i++;
						continue;
					}
				if (a[i] < b[j])
					{
						i++;
					} else if (a[i] > b[j])
					{
						j++;
					} else
					{
						System.out.print(a[i] + " ");
						i++;
						j++;
					}
			}
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size1: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Numbers:");
		for (int i = 0; i < n; i++)
			{
				a[i] = sc.nextInt();
			}
		System.out.print("Array Size2: ");
		int m = sc.nextInt();
		int[] b = new int[m];
		System.out.println("Enter Number:");
		for (int i = 0; i < m; i++)
			{
				b[i] = sc.nextInt();
			}
		intersection(a, b);
		sc.close();
	}
}