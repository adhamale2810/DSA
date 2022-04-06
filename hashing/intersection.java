package hashing;

import java.util.*;

public class intersection
{
static int intersect( int[] A, int[] B )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int c = 0;
		for (int i : A)
			{
				hs.add(i);
			}
		for (int i : B)
			{
				if (hs.contains(i))
					{
						c++;
						hs.remove(i);
					}
			}
		return c;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Array1: ");
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++)
			{
				A[i] = sc.nextInt();
			}
		System.out.println("Array2: ");
		int m = sc.nextInt();
		int[] B = new int[m];
		for (int i = 0; i < m; i++)
			{
				B[i] = sc.nextInt();
			}
		System.out.println(intersect(A, B));
	}
}
