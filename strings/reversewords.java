package strings;

import java.util.*;

public class reversewords
{
static String wordsreverse( String str )
	{
		String res = "";
		String[] words = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--)
			{
				if (i > 0)
					{
						res += words[i] + " ";
					} else
					{
						res += words[i];
					}
			}
		return res;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.nextLine();
		System.out.println(wordsreverse(str));
	}
}
