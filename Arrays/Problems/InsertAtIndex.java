/**
 * Insertion is a basic but frequently used operation. Arrays in most languages cannnot be dynamically 
 * shrinked or expanded. Here, we will work with such arrays and try to insert an element at some index.
 */
package Arrays.Problems;

import java.util.Scanner;

public class InsertAtIndex {

	public static void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
		for (int i = sizeOfArray - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = element;
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
		System.out.print("Enter the element to insert: ");
		int element = sc.nextInt();
		System.out.print("Enter the index position: ");
		int index = sc.nextInt();
		insertAtIndex(arr, sizeOfArray, index, element);
		System.out.println("Array after inserting:");
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}