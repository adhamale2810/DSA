/*
  Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.
 */

package mathematics.problems;

import java.util.*;

public class GPTerm {
	public static double termOfGP(int A, int B, int N) {
		double r = (double) B / A;
		if (N == 1) {
			return A;
		}
		return (double) A * Math.pow(r, (N - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.floor(termOfGP(sc.nextInt(), sc.nextInt(), sc.nextInt())));
		sc.close();
	}
}