package stack;

import java.util.*;

public class InfixEvaluation
{
static int precedence( char op )
	{
		if (op == '+' || op == '-')
			{
				return 1;
			} else if (op == '*' || op == '/')
			{
				return 2;
			} else // op=='^'
			{
				return 3;
			}
	}
static int operation( int v1, int v2, char op )
	{
		if (op == '+')
			{
				return v1 + v2;
			} else if (op == '-')
			{
				return v1 - v2;
			} else if (op == '*')
			{
				return v1 * v2;
			} else if (op == '/')
			{
				return v1 / v2;
			} else
			{
				return (int) Math.pow(v2, v1);
			}
	}
static int evaluate( String exp )
	{
		Stack<Integer> values = new Stack<Integer>(); // stack to store numbers
		Stack<Character> operators = new Stack<Character>(); // stack to store operators
		int v1, v2;
		char op;
		// traverse all characters in the expression
		for (int i = 0; i < exp.length(); i++)
			{
				char curr = exp.charAt(i); // current character
				// character is digit then push to values stack
				if (Character.isDigit(curr))
					{
						values.push((int) curr);
					} else if (curr == '(') // character is '(' then push to operator stack
					{
						operators.push(curr);
					} else if (curr == ')') // character is ')' then
					{
						// pop operators one by one and evaluate till opening bracket occurs
						while (operators.peek() != '(' && operators.size() > 0)
							{
								op = operators.pop();
								v2 = values.pop();
								v1 = values.pop();
								values.push(operation(v1, v2, op)); // evaluate the expression and push value to values stack
							}
						if (operators.size() > 0)
							{
								operators.pop();
							}
					} else if (curr == '+' || curr == '-' || curr == '*' || curr == '/' || curr == '^') // character is an operator then
					{
						// pop operators one by one till '(' occurs or stack gets empty or lower precedence operator occurs
						while (operators.peek() != '(' && operators.size() > 0 && precedence(curr) <= precedence(operators.peek()))
							{
								v2 = values.pop();
								v1 = values.pop();
								op = operators.pop();
								values.push(operation(v1, v2, op)); // evaluate the expression and push value to values stack
							}
						operators.push(curr); // push the current operator to operator stack
					}
			}
		// when the input expression is completely traversed and operators are remaining in the stack then
		// pop operators one by one and evaluate till the stack gets empty and push the final value to values stack
		while (operators.size() > 0)
			{
				v2 = values.pop();
				v1 = values.pop();
				op = operators.pop();
				values.push(operation(v1, v2, op));
			}
		return values.pop(); // final answer stored in the values stack is returned
	}
public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an expression: ");
		//		String exp = sc.nextLine();
		System.out.println(evaluate("2+(5-3*6/2)"));
		sc.close();
	}
}