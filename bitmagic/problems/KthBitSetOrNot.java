/*Given a number N and a bit number K, check if Kth bit of N is set or not.
  A bit is called set if it is 1. Position of set bit '1' should be indexed starting with 0 from LSB side
  in binary representation of the number.
 */

package bitmagic.problems;

import java.util.Scanner;

class KthBitSetOrNot {
	// Function to check if Kth bit is set or not.
	static boolean checkKthBit(int n, int k) {
		if ((n & (1 << k)) != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(checkKthBit(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}