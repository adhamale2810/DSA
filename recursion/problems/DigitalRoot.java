/*
  You are given a number n. You need to find the digital root of n. DigitalRoot
  of a number is the recursive sum of its digits until we get a single digit
  number.
 */

package recursion.problems;

import java.util.Scanner;

public class DigitalRoot {

	private static int digitalRoot(int n) {
		if (n < 10) {
			return n;
		}
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return digitalRoot(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(digitalRoot(sc.nextInt()));
		sc.close();
	}
}