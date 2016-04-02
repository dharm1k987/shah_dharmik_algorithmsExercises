package shah_dharmik_stacks;

import java.util.Scanner;

public class StackDriverA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a sentence: ");
		String sentence = in.nextLine();

		StringStack stackObj = new StringStack();
		addToStack(sentence, stackObj);

		String reversed = reverseSentence(stackObj);
		System.out.printf("The sentence reversed is: %s", reversed);
		in.close();
	}

	private static String reverseSentence(StringStack stackObj) {
		String line = "";
		int size = stackObj.getSize();
		for (int i = 0; i < size; i++) {
			line = line + (stackObj.pop()) + " ";
		}

		return line;
	}

	private static void addToStack(String sentence, StringStack stackObj) {
		String lineSplit[] = sentence.split(" ");

		for (int i = 0; i < lineSplit.length; i++) {
			stackObj.addToStack(lineSplit[i]);
		}

	}

}
