package hashing;

import java.util.*;

public class frequency
{
static void printfreq( int[] arr )
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(arr.length);
		for (int i : arr)
			{
				if (hm.get(i) == null)
					{
						hm.put(i, 1);
					} else
					{
						hm.put(i, ( hm.get(i) + 1 ));
					}
			}
		System.out.println(hm);
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
		printfreq(arr);
	}
}
