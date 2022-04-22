package strings;

import java.util.*;

public class anagramcheck
{
static boolean checkAnagram( String s1, String s2 )
	{
		if (s1.length() != s2.length())
			{
				return false;
			}
		int[] count = new int[256];
		for (int i = 0; i < s1.length(); i++)
			{
				count[s1.charAt(i)]++;
				count[s2.charAt(i)]--;
			}
		for (int i = 0; i < 256; i++)
			{
				if (count[i] != 0)
					{
						return false;
					}
			}
		return true;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1: ");
		String s1 = sc.nextLine();
		System.out.print("String 2: ");
		String s2 = sc.nextLine();
		System.out.println(checkAnagram(s1, s2));
	}
}
