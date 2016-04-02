package shah_dharmik_sortingObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		try {
			File inputFile = new File("students.csv");
			Scanner inFile = null;
			inFile = new Scanner(inputFile);
			inFile.nextLine();
			while (inFile.hasNextLine()) {
				String line;
				line = inFile.nextLine().trim();
				String data[] = line.split(",");
				Sort.addStudents(new Student(data[0].trim(), data[1], Integer
						.valueOf(data[2]), Integer.valueOf(data[3])));

			}
			long startSelection = System.nanoTime();
			Sort.sortStudents();
			long endSelection = System.nanoTime();

			long startCollection = System.nanoTime();
			Collections.sort(Sort.students);
			long endCollection = System.nanoTime();

			inFile.close();

			System.out
					.println("Your sorted .csv file has been created (sortedStudents.csv)");
			System.out.printf("The sorting using selection sort took %d ns.\n",
					endSelection - startSelection);
			System.out.printf("The sorting using collection sort took %d ns.",
					endCollection - startCollection);

			Sort.writetoFile();

		} catch (FileNotFoundException e) {
			System.out.println("The file could not be found.");

		}

	}

}
