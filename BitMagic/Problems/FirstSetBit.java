/**Given an integer an N. The task is to return the position of first set bit found from the right side
 * in the binary representation of the number.
 * Note: If there is no set bit in the integer N, then return 0 from the function.   */

package BitMagic.Problems;

import java.util.*;

class FirstSetBit {
	// Function to find position of first set bit in the given number.
	public static int getFirstSetBit(int n) {

		int position = 1;
		while (n > 0) {
			if ((n & 1) > 0) {
				return position;
			}
			position++;
			n = n >> 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getFirstSetBit(sc.nextInt()));
		sc.close();
	}
}