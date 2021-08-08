/**You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).
 */

package BitMagic.Problems;

import java.util.Scanner;

class TotalSetBits {

	// code with time complexity nlogn
	public static int countSetBits(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			int t = i;
			while (t > 0) {
				if ((t & 1) != 0) {
					c++;
				}
				t = t >> 1;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countSetBits(sc.nextInt()));
		sc.close();
	}
}