package matrix.problems;

import java.util.*;
// https://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1#

public class sumoftrianlges
{
static ArrayList<Integer> sumTriangles( int matrix[][], int n )
	{
		ArrayList<Integer> result = new ArrayList<Integer>(2);
		int usum = 0;
		int lsum = 0;
		// upper triangle
		for (int i = 0; i < n; i++)
			{
				for (int j = i; j < n; j++)
					{
						usum += matrix[i][j];
					}
			}
		result.add(usum);
		// lower triangle
		for (int i = n - 1; i >= 0; i--)
			{
				for (int j = i; j >= 0; j--)
					{
						lsum += matrix[i][j];
					}
			}
		result.add(lsum);
		return result;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Rows and Columns: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter elements Row wise: ");
		for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
					{
						arr[i][j] = sc.nextInt();
					}
			}
		ArrayList<Integer> result = sumTriangles(arr, n);
	}
}
