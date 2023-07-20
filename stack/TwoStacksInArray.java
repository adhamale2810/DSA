package stack;

import java.util.Scanner;

class TwoStack
{
int[] arr;
int top1;
int top2;
int cap;
TwoStack( int n )
	{
		cap = n;
		arr = new int[n];
		top1 = - 1;
		top2 = cap;
	}
void push1( int x )
	{
		if (top1 < top2 - 1)
			{
				top1++;
				arr[top1] = x;
			}
	}
void push2( int x )
	{
		if (top1 < top2 - 1)
			{
				top2--;
				arr[top2] = x;
			}
	}
int pop1( )
	{
		if (top1 >= 0)
			{
				int res = arr[top1];
				top1--;
				return res;
			} else
			{
				return - 1;
			}
	}
int pop2( )
	{
		if (top2 < cap)
			{
				int res = arr[top2];
				top2++;
				return res;
			} else
			{
				return - 1;
			}
	}
int seek1( )
	{
		return arr[top1];
	}
int seek2( )
	{
		return arr[top2];
	}
}

public class TwoStacksInArray
{
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
	}
}
