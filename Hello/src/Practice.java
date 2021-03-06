
public class Practice {
	public static void main(String[] args) {
		int[] array = { 10, 5, 20, 30, 25 };

		BubbleSort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static boolean liniarSearch(int arr[], int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return true;
			}
		}
		return false;
	}

	public static int[] BubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static boolean BinarySeach(int arr[], int item) {
		int start = 0;
		int end = arr.length;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == item)
				return true;
			else if (item > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return false;
	}
}
