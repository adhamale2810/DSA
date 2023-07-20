/*
  Given an integer array representing the heights of N buildings, the task is
  to delete N-2 buildings such that the water that can be trapped between the
  remaining two building is maximum. Note: The total water trapped between two
  buildings is gap between them (number of buildings removed) multiplied by
  height of the smaller building.
 */

package searching.problems;

import java.util.Scanner;

public class MaxWater {

	private static int maxWater(int[] height, int n) {
		int low = 0;
		int high = n - 1;
		int water;
		int max = 0;
		while (low < high) {
			water = (Math.min(height[low], height[high])) * (high - low - 1);
			max = Math.max(water, max);
			if (height[low] < height[high]) {
				low++;
			} else {
				high--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("No. of Buildings: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Heights:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxWater(arr, n));
		sc.close();
	}
}