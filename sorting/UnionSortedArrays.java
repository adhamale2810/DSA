package sorting;

import java.util.*;

public class UnionSortedArrays
{
private static void Union( int[] a, int[] b )
	{
		int m = a.length;
		int n = b.length;
		int i = 0, j = 0;
		while (i < m && j < n)
			{
				if (i > 0 && a[i] == a[i - 1])
					{
						i++;
						continue;
					}
				if (j > 0 && b[j] == b[j - 1])
					{
						j++;
						continue;
					}
				if (a[i] < b[j])
					{
						System.out.print(a[i] + " ");
						i++;
					} else if (a[i] > b[j])
					{
						System.out.print(b[j] + " ");
						j++;
					} else
					{
						System.out.print(a[i] + " ");
						i++;
						j++;
					}
			}
		while (i < m)
			{
				if (i > 0 && a[i] != a[i - 1])
					{
						System.out.print(a[i] + " ");
					}
				i++;
			}
		while (j < n)
			{
				if (j > 0 && b[j] != b[j - 1])
					{
						System.out.print(b[j] + " ");
					}
				j++;
			}
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size1: ");
		int m = sc.nextInt();
		int[] a = new int[m];
		System.out.println("Enter Numbers:");
		for (int i = 0; i < m; i++)
			{
				a[i] = sc.nextInt();
			}
		System.out.print("Array Size2: ");
		int n = sc.nextInt();
		int[] b = new int[n];
		System.out.println("Enter Numbers:");
		for (int i = 0; i < m; i++)
			{
				b[i] = sc.nextInt();
			}
		Union(a, b);
		sc.close();
	}
}