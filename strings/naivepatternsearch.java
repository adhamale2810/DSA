package strings;

import java.util.*;

public class naivepatternsearch
{
static void naiveSearch( String str, String pat )
	{
		int n = str.length();
		int m = pat.length();
		for (int i = 0; i <= n - m; i++)
			{
				int j;
				for (j = 0; j < m; j++)
					{
						if (str.charAt(i + j) != pat.charAt(j))
							{
								break;
							}
					}
				if (j == m)
					{
						System.out.print(i + " ");
					}
			}
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.nextLine();
		System.out.print("Enter a Pattern: ");
		String pat = sc.nextLine();
		naiveSearch(str, pat);
	}
}
