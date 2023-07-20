package mathematics;

import java.util.*;

public class CountDigits {

	private static int countDigits(long n) {
		int c = 0;
		while (n != 0) {
			c++;
			n = n / 10;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countDigits(sc.nextLong()));
		sc.close();
	}
}