/**
 * A prime number is a number which is only divisible by 1 and itself.
 * Given number N check if it is prime or not.
 */

package Mathematics.Problems;

import java.util.Scanner;

public class PrimalityTest {
	public static boolean isPrime(int N) {
		if (N < 0 || N == 0 || N == 1) {
			return false;
		}
		if (N == 2 || N == 3) {
			return true;
		}
		if (N % 2 == 0 || N % 3 == 0) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(N); i = i + 6) {
			if (N % i == 0 || N % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isPrime(sc.nextInt()));
	}
}