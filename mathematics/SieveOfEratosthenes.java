package mathematics;

import java.util.Scanner;

public class SieveOfEratosthenes {

	private static void Sieve(int n) {
		boolean[] arr = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (arr[i]) {
				for (int j = 2 * i; j <= n; j = j + i) {
					arr[j] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (arr[i]) {
				System.out.println(i);
			}
		}
	}

	private static void efficientSieve(int n) {
		boolean[] arr = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (arr[i]) {
				for (int j = i * i; j <= n; j = j + i) {
					arr[j] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (arr[i]) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		efficientSieve(sc.nextInt());
		sc.close();
	}
}