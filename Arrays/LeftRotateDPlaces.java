package Arrays;

import java.util.Scanner;

public class LeftRotateDPlaces {
	private static int[] leftRotateD(int[] arr, int n, int d) {
		int[] temp = new int[d];
		for (int i = 0; i < n; i++) {
			if (i < d) {
				temp[i] = arr[i];
			} else {
				arr[i - d] = arr[i];
			}
		}
		for (int i = 0; i < d; i++) {
			arr[n - d + i] = temp[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Elements:");
		int n = sc.nextInt();
		System.out.print("Places to shift:");
		int d = sc.nextInt();
		System.out.println("Elements:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = leftRotateD(arr, n, d);
		System.out.println("New Array:");
		for (int i = 0; i < n; i++) {
			System.out.println(res[i]);
		}
		sc.close();
	}
}