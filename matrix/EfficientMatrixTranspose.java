package matrix;

import java.util.*;

public class EfficientMatrixTranspose
{
static void transpose( int[][] arr, int r, int c )
	{
		for (int i = 0; i < r; i++)
			{
				for (int j = i+1; j < c; j++)
					{
						int t = arr[i][j];
						arr[i][j] = arr[j][i];
						arr[j][i] = t;
					}
			}
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						System.out.print(arr[i][j] + " ");
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
	}
}
