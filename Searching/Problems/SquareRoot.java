/**
 * Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).
 */
package Searching.Problems;

import java.util.Scanner;

public class SquareRoot {
	private static long floorSqrt(long x) {
		long low = 1;
		long high = x;
		long sqrt = 0;
		while (low <= high) {
			Long mid = (low + high) / 2;
			if (mid * mid == x) {
				return mid;
			} else if (mid * mid > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
				sqrt = mid;
			}
		}
		return sqrt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		long x = sc.nextLong();
		System.out.println(floorSqrt(x));
		sc.close();
	}
}