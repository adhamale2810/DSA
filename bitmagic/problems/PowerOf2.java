/*
  Given a non-negative integer N. The task is to check if N is a power of 2. More formally,
  check if N can be expressed as 2x for some x.
 */

package bitmagic.problems;

import java.util.Scanner;

class PowerOf2 {
	// Function to check if given number n is a power of two.
	public static boolean isPowerofTwo(long n) {
		if (n == 0) {
			return false;
		}
		return ((n & (n - 1)) == 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isPowerofTwo(sc.nextInt()));
		sc.close();
	}
}