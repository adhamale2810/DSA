package Mathematics;

import java.util.Scanner;

public class LCM {

	// Naive Solution
	// private static int naiveLCM(int a, int b) {
	// int res = a > b ? a : b;
	// while (true) {
	// if (res % a == 0 && res % b == 0) {
	// return res;
	// }
	// res++;
	// }
	// }

	// Efficient Solution
	// LCM(a,b) = (a*b) / GCD(a,b);
	private static int euclidGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return euclidGCD(b, a % b);
	}

	private static int efficientLCM(int a, int b) {
		return (a * b) / euclidGCD(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println(naiveLCM(sc.nextInt(), sc.nextInt()));
		System.out.println(efficientLCM(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}