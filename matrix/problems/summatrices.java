package matrix.problems;

import java.util.*;

// https://practice.geeksforgeeks.org/problems/adding-two-matrices3512/1/?track=DSASP-Matrix&batchId=154#
public class summatrices
{
static int[][] sumMatrix( int A[][], int B[][] )
	{
		int r = A.length;
		int c = A[0].length;
		int[][] sum = new int[r][c];
		if (( A.length == B.length ) && ( A[0].length == B[0].length ))
			{
				for (int i = 0; i < r; i++)
					{
						for (int j = 0; j < c; j++)
							{
								sum[i][j] = A[i][j] + B[i][j];
							}
					}
			} else
			{
				sum = new int[1][1];
				sum[0][0] = - 1;
			}
		return sum;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows: ");
		int r = sc.nextInt();
		System.out.print("Columns: ");
		int c = sc.nextInt();
		int[][] A = new int[r][c];
		int[][] B = new int[r][c];
		System.out.println("Array 1: ");
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						A[i][j] = sc.nextInt();
					}
			}
		System.out.println("Array 2: ");
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						B[i][j] = sc.nextInt();
					}
			}
		int[][] res = sumMatrix(A, B);
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						System.out.print(res[i][j] + " ");
					}
				System.out.println("");
			}
	}
}
