package strings;

import java.util.*;

public class leftmostrepeatingchar
{
static int indexlmr( String str )
	{
		int res = Integer.MAX_VALUE;
		final int CHAR = 256;
		int[] findex = new int[CHAR];
		for (int i = 0; i < str.length(); i++)
			{
				int fi = findex[str.charAt(i)];
				if (fi == 0)
					{
						findex[str.charAt(i)] = i;
					} else
					{
						res = Math.min(res, fi);
					}
			}
		return ( res == Integer.MAX_VALUE ) ? - 1 : res;
	}
static int efficientindexlmr( String str )
	{
		boolean[] visited = new boolean[256];
		int res = - 1;
		for (int i = str.length() - 1; i >= 0; i--)
			{
				if (visited[str.charAt(i)] == true)
					{
						res = i;
					} else
					{
						visited[str.charAt(i)] = true;
					}
			}
		return res;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.nextLine();
		System.out.println(indexlmr(str));
	}
}
