/*
  You are given two numbers A and B. The task is to count the number of bits
  needed to be flipped to convert A to B.
 */

package bitmagic.problems;

import java.util.Scanner;

class BitsFlipped {

	// Function to find number of bits needed to be flipped to convert A to B
	public static int countBitsFlip(int a, int b) {
		int c = 0;
		while (a > 0 || b > 0) {
			if ((a & 1) != (b & 1)) {
				c++;
			}
			a = a >> 1;
			b = b >> 1;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countBitsFlip(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}