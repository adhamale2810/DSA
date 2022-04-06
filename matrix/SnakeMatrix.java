package matrix;

import java.util.*;

public class SnakeMatrix
{
static void snakeTraversal( int[][] arr, int r, int c )
	{
		for (int i = 0; i < r; i++)
			{
				if (( i + 1 ) % 2 != 0) // odd rows
					{
						for (int j = 0; j < c; j++)
							{
								System.out.print(arr[i][j] + " ");
							}
					} else // even rows
					{
						for (int j = c - 1; j >= 0; j--)
							{
								System.out.print(arr[i][j] + " ");
							}
					}
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
		System.out.println("Enter elements Row Wise: ");
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						arr[i][j] = sc.nextInt();
					}
			}
		snakeTraversal(arr, r, c);
	}
}
