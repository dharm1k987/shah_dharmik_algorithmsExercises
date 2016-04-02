package shah_dharmik_selectionSort;

public class SelectionSort {

	public static long timeToSort(int arr[]) {

		int i, j, index;
		long start = System.nanoTime();
		for (i = 0; i < arr.length - 1; i++) {
			index = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		long end = System.nanoTime();
		return (end - start);
	}

	public static void swap(int first, int second, int[] arr) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
