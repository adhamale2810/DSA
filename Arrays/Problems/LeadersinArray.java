/**
 * Given an array A of positive integers. Your task is to find the leaders in
 * the array. An element of array is leader if it is greater than or equal to
 * all the elements to its right side. The rightmost element is always a leader.
 */

package Arrays.Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersinArray {

	private static ArrayList<Integer> leaders(int arr[], int n) {
		ArrayList<Integer> res = new ArrayList<>();
		int count = 1;
		int curr = arr[n - 1];
		res.add(curr);
		// append leaders
		for (int i = n - 2; i >= 0; i--) {
			if (curr < arr[i] || curr == arr[i]) {
				curr = arr[i];
				res.add(curr);
				count++;
			}
		}
		// reverse
		for (int i = 0; i < count / 2; i++) {
			int temp = res.get(i);
			res.set(i, res.get(count - 1 - i));
			res.set(count - 1 - i, temp);
		}
		// print
		for (int i = 0; i < count; i++) {
			System.out.print(res.get(i) + " ");
		}
		System.out.println();
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		leaders(arr, n);
		sc.close();
	}
}