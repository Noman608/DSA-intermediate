
public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 100, 10, 5, 7, 20, 30, 25 };
		QuicSort(array,0,array.length-1);
		for (int i : array) {
			System.out.println(i);
		}
		
	}
    
	public static void QuicSort(int arr[], int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			QuicSort(arr, start, pIndex - 1);
			QuicSort(arr, pIndex + 1, end);
		}

	}
	private static int partition(int arr[], int start, int end) {
		int pIndex = start;
		int pivot = arr[end];
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, end, pIndex);
      return pIndex;
	}
	
	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void insertonSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int index = i;
			while (index > 0 && arr[index - 1] > value) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = value;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
