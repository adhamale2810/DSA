package matrix.problems;
// https://practice.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1/?track=DSASP-Matrix&batchId=154#

import java.util.Scanner;

public class transpose
{
static void transpose( int matrix[][], int n )
	{
		for (int i = 0; i < n; i++)
			{
				for (int j = i + 1; j < n; j++)
					{
						int t = matrix[i][j];
						matrix[i][j] = matrix[j][i];
						matrix[j][i] = t;
					}
			}
		for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
					{
						System.out.print(matrix[i][j] + " ");
					}
				System.out.println("");
			}
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Rows and Columns: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
					{
						arr[i][j] = sc.nextInt();
					}
			}
		transpose(arr, n);
	}
}
