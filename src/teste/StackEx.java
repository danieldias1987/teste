package teste;

import java.util.Stack;

public class StackEx {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		Stack list = new Stack();
		list.push(1);
		list.push("A");
		list.push("B");

		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.pop());
		System.out.println(list);
	}

}
