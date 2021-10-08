/*
  You are given heights of consecutive buildings. You can move from the roof of
  a building to the roof of next adjacent building. You need to find the
  maximum number of consecutive steps you can put forward such that you gain an
  increase in altitude with each step.
 */

package searching.problems;

import java.util.Scanner;

public class RoofTop {

	private static int maxStep(int[] A, int N) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < N - 1; i++) {
			if (A[i] < A[i + 1]) {
				count++;
			} else {
				maxCount = Math.max(maxCount, count);
				count = 0;
			}
		}
		return Math.max(maxCount, count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("No. of Buildings: ");
		int N = sc.nextInt();
		int[] A = new int[N];
		System.out.println("Heights:");
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(maxStep(A, N));
		sc.close();
	}
}