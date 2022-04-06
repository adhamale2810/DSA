package searching;

public class InfiniteSizedArray {

	private static int getIndex(int[] arr, int x) {
		if (arr[0] == x) {
			return 0;
		}
		int i = 1;
		while (arr[i] < x) {
			i *= 2;
			if (arr[i] == x) {
				return i;
			}
		}
		return binarySearch(arr, (i / 2) + 1, i - 1, x);
	}

	private static int binarySearch(int[] arr, int low, int high, int x) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}