package shah_dharmik_stacks;

import java.util.ArrayList;

public class StringStack {
	private ArrayList<String> stack = new ArrayList<String>();

	public String pop() {
		String toPop = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return toPop;
	}

	public void push(String s) {
		stack.add(s);
	}

	public boolean isEmpty() {
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}

	public void makeEmpty() {
		stack.clear();
	}

	public void addToStack(String s) {
		stack.add(s);

	}

	public int getSize() {
		return stack.size();
	}

}
