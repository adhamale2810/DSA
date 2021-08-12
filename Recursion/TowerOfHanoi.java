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

	// disks specifies the number of disks to be moved at particular recursion
	// 1st parameter is Source
	// 2nd parameter is Helper
	// 3rd parameter is Destination
	private static void toh(int disks, char A, char B, char C) {
		if (disks == 1) {
			System.out.println(A + " -> " + C);
			return;
		}
		toh(disks - 1, A, C, B);
		System.out.println(A + " -> " + C);
		toh(disks - 1, B, A, C);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int disks = sc.nextInt();
		System.out.println("Transfer all disks from source A to destination C using B");
		System.out.println("Steps:");
		toh(disks, 'A', 'B', 'C');
		sc.close();
	}
}