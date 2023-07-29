package tesster;
import code.DoubllyLinkedList;
public class Tester {
 
	public static void main(String[] args) {
		
		
		DoubllyLinkedList dll=new DoubllyLinkedList();
		dll.insert(10);
		dll.insert(15);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.insert(50);
		dll.insert(60);
		dll.display();
		
//		dll.delete(2);
//		dll.display();
		
		
		dll.insertAtPosition(23, 3);
		dll.display();
		
		
	}
	
	
	
	
	
}



