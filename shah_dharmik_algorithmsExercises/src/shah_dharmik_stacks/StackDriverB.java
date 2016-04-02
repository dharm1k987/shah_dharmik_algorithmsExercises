package shah_dharmik_stacks;

import java.util.Scanner;
import java.util.Stack;

public class StackDriverB {

	public static void main(String[] args) {
		String exp;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an expression (do not put spaces): ");
		exp = in.nextLine();
		exp.replaceAll("\\s+", "");

		if (balanced(exp)) {
			System.out.println("Balanced.");
		} else {
			System.out.println("Not balanced.");
		}

		in.close();
	}

	private static boolean balanced(String exp) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == ('(') || exp.charAt(i) == ('{')
					|| exp.charAt(i) == ('[')) {
				stack.push(String.valueOf(exp.charAt(i)));
			} else if (exp.charAt(i) == (')') || exp.charAt(i) == ('}')
					|| exp.charAt(i) == (']')) {
				if (stack.isEmpty()
						|| !pair(stack.peek(), String.valueOf(exp.charAt(i)))) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty() ? true : false;
	}

	private static boolean pair(String opening, String closing) {
		if (opening.equals("(") && closing.equals(")"))
			return true;
		else if (opening.equals("{") && closing.equals("}"))
			return true;
		else if (opening.equals("[") && closing.equals("]"))
			return true;
		return false;
	}

}
