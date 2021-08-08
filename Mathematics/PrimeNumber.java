package Mathematics;

import java.util.Scanner;

public class PrimeNumber {

	// Naive Solution
	// private static boolean naiveisPrime(int n) {
	// if (n == 1 || n == 0 || n < 0) {
	// return false;
	// }
	// for (int i = 2; i < n; i++) {
	// if (n % i == 0) {
	// return false;
	// }
	// }
	// return true;
	// }

	// Efficient Solution
	// private static boolean efficientisPrime(int n) {
	// if (n == 1 || n == 0 || n < 0) {
	// return false;
	// }
	// for (int i = 2; i < Math.sqrt(n); i++) {
	// if (n % i == 0) {
	// return false;
	// }
	// }
	// return true;
	// }

	// Optimised Efficient Solution
	private static boolean optimisedisPrime(int n) {
		if (n == 0 || n == 1 || n < 0) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println(naiveisPrime(sc.nextInt()));
		// System.out.println(efficientisPrime(sc.nextInt()));
		System.out.println(optimisedisPrime(sc.nextInt()));
		sc.close();
	}
}