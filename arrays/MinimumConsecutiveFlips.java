package arrays;

import java.util.Scanner;

public class MinimumConsecutiveFlips {

	private static int minFlips(int[] arr, int n) {
		int tempZero = 0;
		int tempOne = 0;
		int one = 0;
		int zero = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				tempOne++;
				if (tempZero > 0) {
					zero++;
					tempZero = 0;
				}
			} else {
				tempZero++;
				if (tempOne > 0) {
					one++;
					tempOne = 0;
				}
			}
			if (i == n - 1) {
				if (tempZero > 0) {
					zero++;
					tempZero = 0;
				} else {
					if (tempOne > 0) {
						one++;
						tempOne = 0;
					}
				}
			}
		}
		return Math.min(zero, one);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(minFlips(arr, n));
		sc.close();
	}
}