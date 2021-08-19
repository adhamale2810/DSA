/**
 * Generate Subsets of a String
 * I/P: "ABC"
 * O/P: "", "A", "B", "C", "AB", "AC", "BC", "ABC"
 */

package Recursion;

import java.util.Scanner;

public class StringSubsets {

	public static void subsets(String str, String curr, int i) {
		if (i == str.length()) {
			System.out.println(curr);
			return;
		}
		subsets(str, curr, i + 1); // does not include the current character
		subsets(str, curr + str.charAt(i), i + 1); // includes the current character
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String curr = "";
		int i = 0;
		subsets(sc.nextLine(), curr, i);
		sc.close();
	}
}