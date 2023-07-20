package searching;

import java.util.Scanner;

public class SquareRoot {

	// Naive Solution
	private static int sqRoot(int n) {
		int i = 1;
		while (i * i <= n) {
			i++;
		}
		return i - 1;
	}

	// Efficient Solution
	private static int root(int x) {
		int low = 0;
		int high = x;
		int ans = -1;
		while (low < high) {
			int mid = (low + high) / 2;
			int sq = mid * mid;
			if (sq == x) {
				return mid;
			} else {
				if (sq > x) {
					high = mid - 1;
				} else {
					low = mid + 1;
					ans = mid;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(root(x));
		sc.close();
	}
}