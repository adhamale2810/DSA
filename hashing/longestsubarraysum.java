package hashing;

import java.util.*;

public class longestsubarraysum
{
static int longestsubarray( int[] arr, int sum )
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int res = 0;
		int presum = 0;
		for (int i = 0; i < arr.length; i++)
			{
				presum += arr[i];
				if (presum == sum)
					{
						res = i + 1;
					}
				if (hm.containsKey(presum) == false)
					{
						hm.put(presum, i);
					}
				if (hm.containsKey(presum - sum))
					{
						res = Math.max(res, i - hm.get(presum - sum));
					}
			}
		return res;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int sum = sc.nextInt();
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println(longestsubarray(arr, sum));
	}
}
