package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {

	private static int removeDuplicates(int[] arr, int n) {
		int size = 1;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				size++;
			}
		}
		return size;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(removeDuplicates(arr, n));
		sc.close();
	}
}