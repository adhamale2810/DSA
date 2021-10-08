/*
  Given an array arr[] of size N and two elements x and y, use counter
  variables to find which element appears most in the array, x or y. If both
  elements have the same frequency, then return the smaller element. Note: We
  need to return the element, not its count.
 */

package arrays.problems;

import java.util.Scanner;

public class HasMajority {

	public static int majorityWins(int[] arr, int n, int x, int y) {
		int amajor = -1;
		int bmajor = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				if (amajor == -1) {
					amajor = 0;
				}
				amajor++;
			}
			if (arr[i] == y) {
				if (bmajor == -1) {
					bmajor = 0;
				}
				bmajor++;
			}
		}
		if (amajor != bmajor && (amajor != 0 && bmajor != 0)) {
			if (amajor == -1) {
				return y;
			} else if (bmajor == -1) {
				return x;
			} else {
				return amajor > bmajor ? x : y;
			}
		} else {
			return x < y ? x : y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array: ");
		int n = sc.nextInt();
		System.out.println("Enter the Numbers: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("1st Number: ");
		int x = sc.nextInt();
		System.out.print("2nd Number: ");
		int y = sc.nextInt();
		System.out.println(majorityWins(arr, n, x, y));
		sc.close();
	}
}