package shah_dharmik_selectionSort;

import java.io.*;
import java.util.*;

public class SelectionSortDriver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String dir = System.getProperty("user.dir");
		String fileName = dir + "\\SelectionSort.csv";

		for (int i = 0; i < 5; i++) {
			System.out.print("How many integers would you like to sort: ");

			while (!in.hasNextInt()) {
				System.out.print("Invalid input. Please try again: ");
				in.next();
			}

			int lengthOfArray = in.nextInt();
			int[] arr = new int[lengthOfArray];
			generateIntegers(arr);

			System.out.printf("%d integers to sort.\n", arr.length);
			System.out.printf("The smallest integer in array is: %d\n",
					findSmallestInteger(arr));
			System.out.printf("The larger integer in array is: %d\n",
					findLargestInteger(arr));

			long time = SelectionSort.timeToSort(arr) / 1000000;

			System.out.printf("The sorting took %d ms.\n\n", time);
			createFile(fileName, lengthOfArray, time);
		}
		System.out.println("\n Look at the csv file.");
		in.close();
	}

	private static void createFile(String fileName, int lengthOfArray, long time) {
		try {
			File inFile = new File(fileName);
			FileWriter out = new FileWriter(inFile, true);
			BufferedWriter writeFile = new BufferedWriter(out);
			writeFile.write(lengthOfArray + "," + time);
			writeFile.newLine();
			writeFile.close();
		} catch (Exception e) {
			System.out.println("An error occured while writing to the file.");
		}

	}

	private static int findLargestInteger(int[] arr) {
		int max = arr[0];
		for (int x : arr) {
			if (x > max) {
				max = x;
			}
		}
		return max;
	}

	private static int findSmallestInteger(int[] arr) {
		int min = arr[0];
		for (int x : arr) {
			if (x < min) {
				min = x;
			}
		}
		return min;
	}

	private static void generateIntegers(int[] arr) {
		Random rand = new Random();
		for (int x = 0; x < arr.length; x++) {
			arr[x] = (int) rand.nextInt(Integer.MAX_VALUE);
		}

	}

}
