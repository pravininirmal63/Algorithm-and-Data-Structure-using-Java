package tester;

import code.SinglyCircularLinkedList;

public class Tester {

	public static void main(String[] args) {
		SinglyCircularLinkedList ll = new SinglyCircularLinkedList();
		ll.insert(50);
		ll.insert(30);
		ll.insert(122);
		ll.insert(34);
		ll.insert(16);
		ll.insert(25);
		ll.insert(115);
		ll.insert(80);
		
		ll.display();

		ll.deleteAtPosition(2);
		ll.display();
	}

}
