package mathematics;

import java.util.Scanner;

@SuppressWarnings("unused")
public class AllDivisorsNumber {

	private static void getAllDivisors(int n) {
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(i);
				if (i != n / i) {
					System.out.println(n / i);
				}
			}
		}
	}

	private static void efficientGetAllDivisors(int n) {
		int i;
		for (i = 1; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		for (; i >= 1; i--) {
			if (n % i == 0) {
				System.out.println(n / i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// getAllDivisors(sc.nextInt());
		efficientGetAllDivisors(sc.nextInt());
		sc.close();
	}
}