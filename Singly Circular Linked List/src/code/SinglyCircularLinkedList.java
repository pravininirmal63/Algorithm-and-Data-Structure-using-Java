package code;

public class SinglyCircularLinkedList {
	Node head;
	
	public void insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			head.next=newNode;
		}
		
		Node currentNode=head;
		
		while(currentNode.next!=head) {
			currentNode=currentNode.next;
		}
		
		currentNode.next=newNode;
		newNode.next=head;
	}

	//-----------------------------------------------------------
	
	public void display() {
		System.out.println();
		Node currentNode=head;
		do {
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}
		while(currentNode!=head); 
	}
	//-----------------------------------------------------------
	
	
	public void deleteAtPosition(int position) {
		Node currentNode=head;
		int count =0;
		if(position == 1) {
			head=head.next;
			return;
		}
		position--;
		while(currentNode.next!=head) {
			count ++;
			if(count == position) {
				currentNode.next=currentNode.next.next;
				return;
			}
			currentNode = currentNode.next;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
