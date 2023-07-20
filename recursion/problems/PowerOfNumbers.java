/*
  Given a number and its reverse. Find that number raised to the power of its
  own reverse. Note: As answers can be very large, print the result modulo 10^9 + 7.
 */

package recursion.problems;

import java.util.Scanner;

public class PowerOfNumbers {

	static final long M = (long) (Math.pow(10, 9) + 7);

	// private static long power(int N, int R) {
	// if (N == 0) {
	// return 0;
	// }
	// if (R == 0) {
	// return 1;
	// }
	// return ((N % M) * (power(N, R - 1) % M)) % M;
	// }

	private static long power(int N, int R) {
		if (N == 0) {
			return 0;
		}
		if (R == 0) {
			return 1;
		}
		long NpRb2 = power(N, R / 2) % M;
		long NpR = (NpRb2 * NpRb2) % M;
		if (R % 2 != 0) {
			NpR = (NpR * N) % M;
		}
		return NpR;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(power(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}