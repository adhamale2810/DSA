package recursion;

import java.util.Scanner;

public class DecmialtoBinary {

	private static void fun(int n) {
		if (n == 0) {
			System.out.println(0);
			return;
		}
		fun(n / 2);
		System.out.println(n % 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fun(sc.nextInt());
		sc.close();
	}
}