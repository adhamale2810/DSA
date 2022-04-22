package strings;

import java.util.*;

public class palindromecheck
{
static boolean palincheck( String str )
	{
		int begin = 0;
		int end = str.length() - 1;
		while (begin < end)
			{
				if (str.charAt(begin) != str.charAt(end))
					{
						return false;
					}
				begin++;
				end--;
			}
		return true;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.nextLine();
		System.out.println(palincheck(str));
	}
}
