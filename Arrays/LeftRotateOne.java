package Arrays;

import java.util.Scanner;

public class LeftRotateOne {

	private static int[] leftRotate(int[] arr, int n) {
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = leftRotate(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.println(res[i]);
		}
		sc.close();
	}
}