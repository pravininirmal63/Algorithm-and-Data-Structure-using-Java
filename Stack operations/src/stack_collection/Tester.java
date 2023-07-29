package stack_collection;

import java.util.Stack;

public class Tester {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println( stack.isEmpty());
		stack.push(10);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(20);
		stack.push(18);

		for (Integer i : stack) {
			System.out.print(i + " ");
		}

		stack.pop();
		System.out.println();
		for (Integer i : stack) {
			System.out.print(i + " ");
		}

		stack.pop();
		System.out.println();
		for (Integer i : stack) {
			System.out.print(i + " ");
		}
		System.out.println();
		stack.push(38);

		for (Integer i : stack) {
			System.out.print(i + " ");
		}

		System.out.println( stack.isEmpty());
		
		
		System.out.println(stack.peek());
	}

}
