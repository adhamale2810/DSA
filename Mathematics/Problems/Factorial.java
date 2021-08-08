/**
 * Given a positive integer N. The task is to find factorial of N.
 */

package Mathematics.Problems;

import java.util.Scanner;

public class Factorial {

	private static long factorial(int n) {
		long res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
		sc.close();
	}
}