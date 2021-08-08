package Mathematics;

import java.util.*;

public class ComputingPower {

	private static long power(long x, long n) {
		long res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * x;
		}
		return res;
	}

	private static long efficientPower(long x, long n) {
		if (n == 0) {
			return 1;
		}
		long temp = efficientPower(x, n / 2);
		temp = temp * temp;
		if (n % 2 == 0) {
			return temp;
		} else {
			return temp * x;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(efficientPower(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}