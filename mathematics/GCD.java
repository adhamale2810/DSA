package mathematics;

import java.util.Scanner;

public class GCD {

	// Naive Algorithm
	// private static long getGCD(long a, long b) {
	// long gcd = Integer.MIN_VALUE;
	// for (long i = 1; i <= Math.min(a, b); i++) {
	// if (a % i == 0 && b % i == 0) {
	// gcd = i > gcd ? i : gcd;
	// }
	// }
	// return gcd;
	// }

	// Euclidean Algorithm
	// private static int euclidGCD(int a, int b) {
	// while (a != b) {
	// if (a > b) {
	// a = a - b;
	// } else {
	// b = b - a;
	// }
	// }
	// return a;
	// }

	// Optimized Euclidean Algorithm
	private static int euclidGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return euclidGCD(b, a % b);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(euclidGCD(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}