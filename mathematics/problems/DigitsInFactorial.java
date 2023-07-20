/*
  Given an integer N. Find the number of digits that appear in its factorial.
  Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
 */

package mathematics.problems;

import java.util.*;

public class DigitsInFactorial {
	public static int digitsInFactorial(int N) {
		// log(a*b) = log(a) + log(b)
		// log(n!) = log(1*2*3*......*n)
		// = log(1) + log(2) + log(3) + ..... + log(n)
		// the floor value of log base 10 increased by 1 of any number gives the number
		// of digits in that number
		if (N < 0) {
			return 0;
		} else if (N <= 1) {
			return 1;
		} else {
			double digits = 0;
			for (int i = 2; i <= N; i++) {
				digits += Math.log10(i);
			}
			return (int) (Math.floor(digits)) + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(digitsInFactorial(sc.nextInt()));
		sc.close();
	}
}