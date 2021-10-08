package recursion;

import java.util.Scanner;

public class SubsetSum {

	private static int countSubsets(int[] arr, int n, int sum) {
		if (n == 0) {
			return (sum == 0) ? 1 : 0;
		}
		return countSubsets(arr, n - 1, sum) + countSubsets(arr, n - 1, sum - arr[n - 1]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array: ");
		int n = sc.nextInt();
		System.out.println("Enter array elements:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the sum value to check: ");
		int sum = sc.nextInt();
		System.out.println(countSubsets(arr, n, sum));
		sc.close();
	}
}