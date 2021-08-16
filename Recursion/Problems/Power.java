/**
 * You are given two numbers n and p. You need to find np.
 */

package Recursion.Problems;

import java.util.Scanner;

public class Power {

	private static int RecursivePower(int n, int p) {
		if (p == 0) {
			return 1;
		}
		return n * RecursivePower(n, p - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(RecursivePower(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}