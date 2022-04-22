package strings;

import java.util.*;

public class rotationstrings
{
static boolean rotating( String a, String b )
	{
		if (a.length() != b.length())
			{
				return false;
			}
		return ( a + a ).indexOf(b) >= 0 ? true : false;
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1: ");
		String a = sc.nextLine();
		System.out.print("String 2: ");
		String b = sc.nextLine();
		System.out.println(rotating(a, b));
	}
}
