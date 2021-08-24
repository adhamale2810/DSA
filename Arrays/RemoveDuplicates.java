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

	private static void removeArrayDuplicates(int[] arr, int n) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (arr[count - 1] != arr[i]) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
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
		System.out.println("Count:" + removeDuplicates(arr, n));
		removeArrayDuplicates(arr, n);
		sc.close();
	}
}