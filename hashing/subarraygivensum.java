package hashing;

import java.util.*;

public class subarraygivensum
{
static boolean checksubarraysum( int[] arr, int sum )
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int presum = 0;
		for (int i : arr)
			{
				presum += i;
				if (presum == sum)
					{
						return true;
					}
				if (hs.contains(presum - sum))
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
		System.out.print("Enter any Number: ");
		int sum = sc.nextInt();
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.println(checksubarraysum(arr, sum));
	}
}
