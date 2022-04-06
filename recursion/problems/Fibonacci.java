/*
  You are given a number n. You need to find nth Fibonacci number.
  F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1
 */
package recursion.problems;

import java.util.Scanner;

public class Fibonacci {

	private static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fibonacci(sc.nextInt()));
		sc.close();
	}
}