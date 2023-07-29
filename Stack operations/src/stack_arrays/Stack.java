package stack_arrays;

public class Stack {
	private int[] arr;
	private int size;
	private int top;
	
	public Stack(int size) {
		this.size=size;
		arr=new int[this.size];
		this.top=-1;
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full, cannot add elements");
			return;
		}
		
		arr[++top]=data;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("cannot delete elements, stack is empty");
		}
		
		top--;
	}
	
	
	public int peek() {
		return arr[top];
	}
	
	public int tSize() {
		return top+1;
	}
	
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	
	
	

}
