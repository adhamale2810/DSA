/**
 * Towers A, B, C.
 * Move the disks from tower A to tower C
 * Rules: 
 * 1) Only one disk can be moved at a time
 * 2) Disk of larger size cannot be placed over smaller disk
 * 3) Only the top disk of a tower can be moved
 */

package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	private static void pm(int start, int end) {
		System.out.println(start + " -> " + end);
	}

	private static void toh(int n, int start, int end) {
		if (n == 1) {
			pm(start, end);
		} else {
			int other = 6 - (start + end);
			toh(n - 1, start, other);
			pm(start, end);
			toh(n - 1, other, end);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		toh(sc.nextInt(), 1, 3);
		sc.close();
	}
}