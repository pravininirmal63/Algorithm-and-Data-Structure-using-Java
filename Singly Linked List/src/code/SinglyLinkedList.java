package code;

public class SinglyLinkedList {

	private Node head;

	public SinglyLinkedList() {
		head = null;
	}

	public void insertElement(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	public void display() {
		System.out.println();
		if (head == null) {
			System.out.println("Empty List.....");
			return;
		}

		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public boolean searchElement(int data) {

		Node currentNode = head;
		int count = 0;
		while (currentNode != null) {
			count++;
			if (currentNode.data == data) {
				System.out.println("Element at position: " + count);
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}

	public void insertElementAtPosition(int data, int position) {
		if (head == null) {
			System.out.println("empty list");
			return;
		}
		Node newNode = new Node(data);
		int count = 0;
		if (position == 1) {
			Node tempNode = head;
			head = newNode;
			newNode.next = tempNode;
			return;
		}
		position--;
		Node currentNode = head;
		while (currentNode != null) {
			count++;
			if (count == position) {
				Node tempNode = currentNode.next;
				currentNode.next = newNode;
				newNode.next = tempNode;

			}
			currentNode = currentNode.next;
		}
		System.out.println("\nElement inserted successfully");

	}

	public void deleteAtPosition(int position) {
		if (head == null) {
			return;
		}
		int count = 0;
		if (position == 1) {
			head = head.next;
			System.out.println("\nElement deleted successfully");
			return;
		}
		position--;
		Node currentNode = head;
		while (currentNode != null) {
			count++;
			if (count == position) {

				currentNode.next = currentNode.next.next;

			}
			currentNode = currentNode.next;
		}
		System.out.println("\nelemement deleted successfully");
	}

	
	public void deleteByData(int data) {
		if(head==null) {
			System.out.println("empty list..");
			return;
		}
		
		Node currentNode=head;
		
		while(currentNode!=null) {
			
			if(currentNode.next.data==data) {
				currentNode.next=currentNode.next.next;
				return;
			}
			currentNode=currentNode.next;
		}
		System.out.println("data not found...!");
	}
	
}
