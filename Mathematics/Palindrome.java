package Mathematics;

import java.util.*;

public class Palindrome {

	private static String is_palindrome(int n) {
		int t = n;
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		return rev == t ? "Yes" : "No";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(is_palindrome(sc.nextInt()));
		sc.close();
	}
}