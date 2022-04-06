package matrix;

import java.util.*;

public class SearchSortedMatrix
{
static void search( int[][] arr, int r, int c, int x )
	{
		int i = 0;
		int j = c - 1;
		while (i < r && j >= 0)
			{
				if (arr[i][j] == x)
					{
						System.out.println("(" + i + ", " + j + ")");
						return;
					} else if (arr[i][j] > x)
					{
						j--;
					} else
					{
						i++;
					}
			}
		System.out.println("Not Found");

	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows: ");
		int r = sc.nextInt();
		System.out.print("Columns: ");
		int c = sc.nextInt();
		System.out.print("Enter element to search: ");
		int x = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter elements Row Wise: ");
		for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
					{
						arr[i][j] = sc.nextInt();
					}
			}
		search(arr, r, c, x);
		System.out.println("");
	}
}
