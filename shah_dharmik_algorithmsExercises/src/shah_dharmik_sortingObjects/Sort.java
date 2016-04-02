package shah_dharmik_sortingObjects;

import java.io.*;
import java.util.*;

public class Sort {

	public static ArrayList<Student> students = new ArrayList<Student>();

	public static void addStudents(Student s) {
		students.add(s);
	}

	public static void sortStudents() {
		int i, j, index;

		for (i = 0; i < students.size() - 1; i++) {
			index = i;
			for (j = i + 1; j < students.size(); j++) {

				if (students.get(j).getmark() < (students.get(index).getmark())) {

					index = j;

				}
			}
			swap(i, index);

		}

	}

	private static void swap(int i, int index) {
		Student temp = students.get(index);
		students.set(index, students.get(i));
		students.set(i, temp);

	}

	public static void writetoFile() {
		try {
			File inFile = new File("sortedStudents.csv");
			FileWriter out;
			out = new FileWriter(inFile);
			BufferedWriter writeFile = new BufferedWriter(out);

			writeFile.write("FIRST,LAST,ID,MARK");
			writeFile.newLine();

			for (Student s : students) {
				writeFile.write(s.getFirstName() + "," + s.getLastName() + ","
						+ s.getID() + "," + s.getmark());
				writeFile.newLine();
			}
			writeFile.close();
		} catch (IOException e) {
			System.out.println("An error occured.");
		}

	}

}
