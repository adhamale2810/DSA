/*
  You are given an integer N. Print numbers from 1 to N without the help of loops.
 */
package recursion.problems;

import java.util.Scanner;

public class Print1toN {

	private static void printTillN(int N) {
		if (N == 0) {
			return;
		}
		printTillN(N - 1);
		System.out.print(N + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printTillN(sc.nextInt());
		sc.close();
	}
}