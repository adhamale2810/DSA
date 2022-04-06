package matrix;

import java.util.*;

public class MatrixBoundary
{
static void printBoundary( int[][] arr, int r, int c )
	{
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		if (r == 1)
			{
				for (int i = 0; i < c; i++)
					{
						System.out.print(arr[0][i] + " ");
					}
				return;
			}
		if (c == 1)
			{
				for (int i = 0; i < r; i++)
					{
						System.out.print(arr[i][0] + " ");
					}
				return;
			}
		// top wall
		for (int i = minc; i <= maxc; i++)
			{
				System.out.print(arr[minr][i] + " ");
			}
		// right wall
		for (int i = minr + 1; i < maxr; i++)
			{
				System.out.print(arr[i][maxc] + " ");
			}
		// bottom wall
		for (int i = maxc; i > minc; i--)
			{
				System.out.print(arr[maxr][i] + " ");
			}
		// left wall
		for (int i = maxr; i > minr; i--)
			{
				System.out.print(arr[i][minc] + " ");
			}
		System.out.println("");
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows: ");
		int r = sc.nextInt();
		System.out.print("Columns: ");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter Elements Row wise: ");
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						arr[i][j] = sc.nextInt();
					}
			}
		printBoundary(arr, r, c);
	}
}
