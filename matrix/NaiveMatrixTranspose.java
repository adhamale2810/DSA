package matrix;

import java.util.*;

public class NaiveMatrixTranspose
{
static void transposeMatrix( int[][] arr, int r, int c )
	{
		int[][] temp = new int[r][c];
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						temp[j][i] = arr[i][j];
					}
			}
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						System.out.print(temp[i][j] + " ");
					}
				System.out.println("");
			}
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows: ");
		int r = sc.nextInt();
		System.out.println("Columns: ");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						arr[i][j] = sc.nextInt();
					}
			}
		transposeMatrix(arr, r, c);
	}
}
