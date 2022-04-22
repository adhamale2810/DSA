package strings;

import java.util.*;

public class leftmostnonrepeatingchar
{
static int leftmostnonrch( String str )
	{
		int res = - 1;
		boolean[] visited = new boolean[256];
		for (int i = str.length() - 1; i >= 0; i--)
			{
				if (! visited[str.charAt(i)])
					{
						res = i;
					}
				visited[str.charAt(i)] = true;
			}
		return res;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		System.out.println(leftmostnonrch(str));
	}
}
