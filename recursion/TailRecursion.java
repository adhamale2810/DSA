package recursion;

import java.util.Scanner;

public class TailRecursion {

	private static void tailRecursiveFun(int n) { // O/P: 5 4 3 2 1
		if (n == 0) {
			return;
		}
		System.out.println(n);
		tailRecursiveFun(n - 1);
	}

	private static void notTailRecursiveFun(int n, int k) { // O/P: 1 2 3 4 5
		if (n == 0) {
			return;
		}
		System.out.println(k);
		notTailRecursiveFun(n - 1, k + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Tail Recursive Function:");
		tailRecursiveFun(n);
		System.out.println("Converted to Tail Recursive Function:");
		notTailRecursiveFun(n, 1);
		sc.close();
	}
}