/*Given two numbers M and N.
  The task is to find the position of the rightmost different bit in the binary representation of numbers.
 */

package bitmagic.problems;

import java.util.Scanner;

class RightMostDiffBit {
	// Function to find the first position with different bits.
	public static int posOfRightMostDiffBit(int m, int n) {
		int position = 1;
		while (m > 0 || n > 0) {
			if ((m & 1) != (n & 1)) {
				return position;
			}
			position++;
			m = m >> 1;
			n = n >> 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(posOfRightMostDiffBit(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}
