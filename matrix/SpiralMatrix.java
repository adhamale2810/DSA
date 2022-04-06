package matrix;

import java.util.*;

public class SpiralMatrix
{
static ArrayList<Integer> spirallyTraverse( int matrix[][], int r, int c )
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int count = 0;
		int tne = r * c;
		int minr = 0;
		int minc = 0;
		int maxr = matrix.length - 1;
		int maxc = matrix[0].length - 1;
		while (count < tne)
			{
				// top wall
				for (int i = minc; i <= maxc && count < tne; i++)
					{
						result.add(matrix[minr][i]);
						count++;
					}
				// right wall
				for (int i = minr + 1; i < maxr && count < tne; i++)
					{
						result.add(matrix[i][maxc]);
						count++;
					}
				// bottom wall
				for (int i = maxc; i > minc && count < tne; i--)
					{
						result.add(matrix[maxr][i]);
						count++;
					}
				// left wall
				for (int i = maxr; i > minr && count < tne; i--)
					{
						result.add(matrix[i][minc]);
						count++;
					}
				minr++;
				minc++;
				maxr--;
				maxc--;
			}
		return result;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Rows: ");
		int r = sc.nextInt();
		System.out.print("Number of Columns: ");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter Elements Row Wise: ");
		for (int i = 0; i < r; i++) // row
			{
				for (int j = 0; j < c; j++) // column
					{
						arr[i][j] = sc.nextInt();
					}
			}
		ArrayList<Integer> result = spirallyTraverse(arr, r, c);
		for (int i = 0; i < r * c; i++)
			{
				System.out.print(result.get(i));
			}
	}
}
