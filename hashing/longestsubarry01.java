package hashing;

import java.util.*;

public class longestsubarry01
{
static int subarrayzeroone( int[] arr )
	{
		int res = 0;
		int presum = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] == 0)
					{
						presum += - 1;
					} else
					{
						presum += arr[i];
					}
				if (presum == 0)
					{
						res = Math.max(res, i + 1);
					}
				if (hm.containsKey(presum) == false)
					{
						hm.put(presum, i);
					}
				if (hm.containsKey(presum))
					{
						res = Math.max(res, i - hm.get(presum));
					}
			}
		return res;
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
		System.out.println(subarrayzeroone(arr));
	}
}
