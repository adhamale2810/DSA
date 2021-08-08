package Recursion;

import java.util.Scanner;

public class SumTillN {

	private static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

	private static int sumTailRecursive(int n, int res) {
		if (n == 0) {
			return res;
		}
		return sumTailRecursive(n - 1, res + n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Recursive: " + sum(n));
		System.out.println("Tail Recursive: " + sumTailRecursive(n, 0));
		sc.close();
	}
}