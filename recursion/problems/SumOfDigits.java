/*
  You are given a number n. You need to find the sum of digits of n.
 */
package recursion.problems;

import java.util.Scanner;

public class SumOfDigits {

	private static int sumOfDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return n % 10 + sumOfDigits(n / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sumOfDigits(sc.nextInt()));
		sc.close();
	}
}