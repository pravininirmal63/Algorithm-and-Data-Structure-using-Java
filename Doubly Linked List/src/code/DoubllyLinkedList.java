package code;

public class DoubllyLinkedList {
	private Node head;
	private Node tail;

	public void insert(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;

		} else {
			tail.next = newnode;
			newnode.prev = tail;
			tail = newnode;
		}
	}

	public void display() {
		System.out.println("forward traversal....");
		Node currentNode = head;
		System.out.println("");
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}

//		System.out.println("");
//		System.out.println("");
//	    System.out.println("reverse traversal.....");
//	     currentNode=tail;
//	     while(currentNode!=null) {
//	    	 System.out.print(currentNode.data+" ");
//	    	 currentNode=currentNode.prev;
//	     }
	}

	public void delete(int position) {

		Node currentNode = head;
		int count = 0;
		if (position == 1) {
			head = head.next;
			return;
		}

		while (currentNode != null) {
			count++;
			if (count == position) {
				currentNode.prev.next = currentNode.next;
				currentNode.next.prev = currentNode.prev;
			}

			currentNode = currentNode.next;

		}
	}

	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);
		Node currentNode = head;
		int count = 1;
		if (position ==1) {
			Node temp=head.next;
			head=newNode;
			newNode.next=temp;
			temp.prev=newNode;
			return;
		}

		while (currentNode != null) {
			count++;

			if (count == position) {

				Node temp = currentNode.next;
				currentNode.next = newNode;
				newNode.next = temp;
				temp.prev = newNode;
				newNode.prev = currentNode;

			}

			currentNode = currentNode.next;
		}

	}

}
