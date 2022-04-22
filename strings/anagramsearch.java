package strings;

import java.util.*;

public class anagramsearch
{
static final int CHAR = 256;
static boolean areSame( int[] text, int[] pattern )
	{
		for (int i = 0; i < CHAR; i++)
			{
				if (text[i] != pattern[i])
					{
						return false;
					}
			}
		return true;
	}
static boolean isAnagram( String str, String pat )
	{
		int[] text = new int[CHAR];
		int[] pattern = new int[CHAR];
		for (int i = 0; i < pat.length(); i++)
			{
				text[str.charAt(i)]++;
				pattern[pat.charAt(i)]++;
			}
		for (int i = pat.length(); i < str.length(); i++)
			{
				if (areSame(text, pattern))
					{
						return true;
					}
				text[str.charAt(i)]++;
				text[str.charAt(i - pat.length())]--;
			}
		return false;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.nextLine();
		System.out.print("Enter Pattern to Search: ");
		String pat = sc.nextLine();
		System.out.println(isAnagram(str, pat));
	}
}
