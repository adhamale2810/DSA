/**
 * Given a positive integer value N. The task is to find how many numbers less than or equal to N
 * have numbers of divisors exactly equal to 3.
 */

package Mathematics.Problems;

import java.util.Scanner;

public class Exactly3Divisors {

	// Only Square Numbers can have exactly 3 divisors and that too only of prime
	// numbers
	// So we need to find squares of prime numbers till N
	public static boolean isPrime(int n) {
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

	public static int exactly3Divisors(int N) {
		int count = 0;
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (isPrime(i)) {
				if (i * i <= N) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(exactly3Divisors(sc.nextInt()));
		sc.close();
	}
}