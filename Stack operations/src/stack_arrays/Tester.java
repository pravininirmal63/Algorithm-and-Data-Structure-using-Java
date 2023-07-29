package stack_arrays;

public class Tester {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(30);
		stack.push(20);
		stack.push(41);
		stack.push(14);
		
		stack.display();
		System.out.println();
		stack.pop();
		stack.display();
		
		System.out.println();
		System.out.println(stack.peek());
		

	}

}
