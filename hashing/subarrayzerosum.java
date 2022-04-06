package hashing;

import java.util.*;

public class subarrayzerosum
{
static boolean checksubarray( int[] arr )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int presum = 0;
		for (int i : arr)
			{
				presum += i;
				if (hs.contains(presum))
					return true;
				if (presum == 0)
					{
						return true;
					}
				hs.add(presum);
			}
		return false;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.println(checksubarray(arr));
	}
}
