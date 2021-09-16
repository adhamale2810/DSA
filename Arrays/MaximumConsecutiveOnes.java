package Arrays;

import java.util.Scanner;

public class MaximumConsecutiveOnes {

	private static int maxOnes(int[] arr, int n) {
		int max = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				c = 0;
			} else {
				c++;
				max = Math.max(max, c);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxOnes(arr, n));
		sc.close();
	}
}