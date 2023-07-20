/*
  You are given a number n. You need to find the count of digits in n.
 */
package recursion.problems;

import java.util.Scanner;

public class CountDigits {

	private static int countDigits(int n) {
		if (n < 10) {
			return 1;
		}
		return 1 + countDigits(n / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countDigits(sc.nextInt()));
		sc.close();
	}
}