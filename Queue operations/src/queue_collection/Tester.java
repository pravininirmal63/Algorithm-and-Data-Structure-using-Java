package queue_collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tester {

	public static void main(String[] args) {
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println();
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
		
		list.addFirst(35);
		System.out.println();
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
		
		list.removeLast();
		System.out.println();
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
		list.removeFirst();
		System.out.println();
		for(Integer i:list) {
			System.out.print(i+" ");
		}

	}

}
