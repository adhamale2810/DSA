package Arrays.Problems;

import java.util.Scanner;

public class MinAdjacentDiffCircular {
	public static int minAdjDiff(int arr[], int n) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			min = Math.min(min, Math.abs(arr[i + 1] - arr[i]));
		}
		return Math.min(min, Math.abs(arr[n - 1] - arr[0]));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(minAdjDiff(arr, n));
		sc.close();
	}
}