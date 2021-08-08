package Mathematics;

import java.util.Scanner;

public class PrimeFactors {

	// Simple Solution
	public static void getPrimeFactors(int n) {
		int f = 2;
		while (n > 1) {
			if (n % f == 0) {
				System.out.println(f);
				n /= f;
				f--;
			}
			f++;
		}
	}

	// Efficient Solution
	public static void efficientPrimeFactors(int n) {
		if (n <= 1) {
			System.out.println(-1);
		}
		while (n % 2 == 0) {
			System.out.println(2);
			n = n / 2;
		}
		while (n % 3 == 0) {
			System.out.println(3);
			n = n / 3;
		}
		for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
			while (n % (i + 2) == 0) {
				System.out.println(i + 2);
				n = n / (i + 2);
			}
		}
		if (n > 3) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// getPrimeFactors(sc.nextInt());
		efficientPrimeFactors(sc.nextInt());
		sc.close();
	}
}