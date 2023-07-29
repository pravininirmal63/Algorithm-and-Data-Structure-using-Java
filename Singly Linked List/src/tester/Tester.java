package tester;
import java.util.Scanner;

import code.SinglyLinkedList;
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertElement(1);
		sll.insertElement(3);
		sll.insertElement(5);
		sll.insertElement(6);
		sll.insertElement(8);
		sll.insertElement(7);
		sll.insertElement(45);
		sll.insertElement(65);
		sll.insertElement(100);
		
		sll.display();
//		System.out.println("\nEnter element to search :");
//		if(sll.searchElement(sc.nextInt())) {
//			System.out.println("element is present in the list");
//		}
//		else {
//			System.out.println("element not found in the list");
//		}
		
		
//		sll.insertElementAtPosition(81, 4);
//		sll.display();
		
		
//		sll.deleteAtPosition(3);
//		sll.display();
		
		
		sll.deleteByData(8);
		sll.display();
	}

}
