package Recursion;

import java.util.Scanner;

public class FactorialTailRecursive {

	private static int factTail(int n, int res) {
		if (n == 0 || n == 1) {
			return res;
		}
		return factTail(n - 1, res * n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(factTail(sc.nextInt(), 1));
		sc.close();
	}
}