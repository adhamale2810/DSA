/**You are given an interger I, find the absolute value of the interger I.
 */

package Mathematics.Problems;

import java.util.Scanner;

class AbsoluteValue {
	public static int absolute(int I) {
		if (I < 0) {
			return -I;
		} else {
			return I;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(absolute(sc.nextInt()));
		sc.close();
	}
}