package strings;

import java.util.*;

public class subsequencecheck
{
static boolean subcheck( String s1, String s2 )
	{
		int i = 0;
		int j = 0;
		while (j < s2.length() && i < s1.length())
			{
				if (s1.charAt(i) == s2.charAt(j))
					{
						i++;
						j++;
					} else
					{
						i++;
					}
			}
		return ( j == s2.length() - 1 );
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(subcheck(s1, s2));
	}
}
