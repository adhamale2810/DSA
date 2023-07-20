package stack;

import java.util.*;

public class BalancedParantheses
{
static boolean isMatching( char o, char e )
	{
		return ( o == '{' && e == '}' ) || ( o == '[' && e == ']' ) || ( o == '(' && e == ')' );
	}
static boolean isBalanced( String str )
	{
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++)
			{
				char curr = str.charAt(i);
				if (curr == '(' || curr == '{' || curr == '[')
					{
						st.push(curr);
					} else
					{
						if (st.empty())
							{
								return false;
							}
						if (isMatching(st.peek(), curr) == false)
							{
								return false;
							} else
							{
								st.pop();
							}
					}
			}
		return st.empty();
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String of Parentheses: ");
		String str = sc.nextLine();
		System.out.println(isBalanced(str));
		sc.close();
	}
}
