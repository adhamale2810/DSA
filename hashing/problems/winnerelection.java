package hashing.problems;
// https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1

import java.util.*;

public class winnerelection
{
static String[] winner( String arr[], int n )
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String s : arr)
			{
				if (hm.containsKey(s))
					{
						hm.put(s, hm.get(s) + 1);
					} else
					{
						hm.put(s, 1);
					}
			}
		String res = "";
		for (String s : arr)
			{
				if (res == "")
					{
						res = s;
					}
				if (hm.get(s) > hm.get(res))
					{
						res = s;
					}
				if (hm.get(s) == hm.get(res))
					{
						if (s.compareTo(res) < 0)
							{
								res = s;
							}
					}
			}
		String[] a = {res, hm.get(res).toString()};
		return a;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextLine();
			}
		System.out.println(winner(arr, n));
	}
}
