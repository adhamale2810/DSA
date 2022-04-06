package arrays;

import java.util.Scanner;

public class ReverseArray {

	private static int[] reverse(int[] arr, int n) {
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = reverse(arr, n);
		System.out.println("Reverse:");
		for (int i = 0; i < n; i++) {
			System.out.println(res[i]);
		}
		sc.close();
	}
}