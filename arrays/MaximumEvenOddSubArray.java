package arrays;

import java.util.Scanner;

public class MaximumEvenOddSubArray {

	private static int maxSubArray(int[] arr, int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			int curr = 1;
			for (int j = i + 1; j < n; j++) {
				if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
					curr++;
				} else {
					break;
				}
			}
			res = Math.max(res, curr);
		}
		return res;
	}

	private static int maxSubArrayN(int[] arr, int n) {
		int res = 0;
		int curr = 1;
		for (int i = 1; i < n; i++) {
			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
				curr++;
				res = Math.max(res, curr);
			} else {
				curr = 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxSubArrayN(arr, n));
		sc.close();
	}
}