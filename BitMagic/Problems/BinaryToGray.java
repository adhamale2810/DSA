package BitMagic.Problems;

import java.util.Scanner;

public class BinaryToGray {

	private static int bToG(int n) {
		return (n ^ n >> 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(bToG(sc.nextInt()));
		sc.close();
	}
}