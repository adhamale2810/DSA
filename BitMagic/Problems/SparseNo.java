/**Given a number N. The task is to check whether it is sparse or not.
 * A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.
 */

package BitMagic.Problems;

import java.util.Scanner;

class SparseNo {
	// Function to check if the number is sparse or not.
	public static boolean isSparse(int n) {
		if ((n & (n >> 1)) == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isSparse(sc.nextInt()));
		sc.close();
	}
}