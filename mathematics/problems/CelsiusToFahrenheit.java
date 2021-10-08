/*
  Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.
 */

package mathematics.problems;

import java.util.Scanner;

class CelsiusToFahrenheit {
	public static double cToF(int C) {
		return (C * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(cToF(sc.nextInt()));
		sc.close();
	}
}
