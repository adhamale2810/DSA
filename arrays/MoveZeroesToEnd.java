package arrays;

import java.util.Scanner;

public class MoveZeroesToEnd {

	private static void moveZeroes(int[] arr, int n) {
		int nonZeroCount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[nonZeroCount];
				arr[nonZeroCount] = arr[i];
				arr[i] = temp;
				nonZeroCount++;
			}
		}
		System.out.println("Modified Array:");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		moveZeroes(arr, n);
		sc.close();
	}
}