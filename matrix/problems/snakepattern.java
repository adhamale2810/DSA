package matrix.problems;
// https://practice.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1#

import java.util.*;

public class snakepattern
{
static ArrayList<Integer> snakePattern( int matrix[][] )
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		int n = matrix.length;
		for (int i = 0; i < n; i++)
			{
				if (( i + 1 ) % 2 != 0) // odd rows
					{
						for (int j = 0; j < n; j++)
							{
								res.add(matrix[i][j]);
							}
					} else // even rows
					{
						for (int j = n - 1; j >= 0; j--)
							{
								res.add(matrix[i][j]);
							}
					}
			}
		return res;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Rows and Columns: ");
		int r = sc.nextInt();
		int[][] arr = new int[r][r];
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < r; j++)
					{
						arr[i][j] = sc.nextInt();
					}
			}
		ArrayList<Integer> res = snakePattern(arr);
		for (int i = 0; i < r * r; i++)
			{
				System.out.print(res.get(i) + " ");
			}
		System.out.println("");
	}
}
