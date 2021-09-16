/**
 * Insertion is a basic but frequently used operation. Arrays in most languages can not be dynamically 
 * shrinked or expanded. Here, we will work with such arrays and try to insert an element at the end of the array.
 */
package Arrays.Problems;

import java.util.Scanner;

public class InsertEnd {

	public static void insertAtEnd(int arr[], int sizeOfArray, int element) {
		arr[sizeOfArray - 1] = element;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array: ");
		int sizeOfArray = sc.nextInt();
		int[] arr = new int[sizeOfArray];
		System.out.println("Enter the Numbers: ");
		for (int i = 0; i < sizeOfArray - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Element to insert: ");
		int element = sc.nextInt();
		insertAtEnd(arr, sizeOfArray, element);
		System.out.println("Final Array: ");
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}