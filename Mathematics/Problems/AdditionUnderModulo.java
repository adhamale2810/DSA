/**
 * Given two numbers a and b, find the sum of a and b. Since the sum can be very large, 
 * find the sum modulo (10^9)+7.
 */

package Mathematics.Problems;

import java.util.*;

public class AdditionUnderModulo {

	public static long sumUnderModulo(long a, long b) {
		return (a % ((long) Math.pow(10, 9) + 7) + b % ((long) Math.pow(10, 9) + 7)) % ((long) Math.pow(10, 9) + 7);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sumUnderModulo(sc.nextLong(), sc.nextLong()));
		sc.close();
	}
}