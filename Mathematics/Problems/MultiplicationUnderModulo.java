/**
 * You are given two numbers a and b.
 * You need to find the multiplication of a and b under modulo M (M as (10^9)+7).
 */

package Mathematics.Problems;

import java.util.*;

public class MultiplicationUnderModulo {

	static long multiplicationUnderModulo(long a, long b) {
		return ((a % ((long) (Math.pow(10, 9)) + 7)) * (b % ((long) (Math.pow(10, 9)) + 7)))
				% ((long) (Math.pow(10, 9)) + 7);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(multiplicationUnderModulo(sc.nextLong(), sc.nextLong()));
		sc.close();
	}
}