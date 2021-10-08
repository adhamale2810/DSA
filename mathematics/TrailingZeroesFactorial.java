package mathematics;

import java.util.*;

public class TrailingZeroesFactorial {

	// Naive Solution
	// private static long trailingZeroes(int n) {
	// long fact = 1;
	// for (int i = 0; i <= n; i++) {
	// fact *= i;
	// }
	// long d = 0;
	// while (fact % 10 == 0) {
	// d++;
	// fact /= 10;
	// }
	// return d;
	// }

	private static int countZero(int n) {
		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + (n / i);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countZero(sc.nextInt()));
		sc.close();
	}
}