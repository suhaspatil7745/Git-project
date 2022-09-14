package com.velocity.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
	
		LinkedList<Integer> list1= new LinkedList<Integer>();
		list1.add(2);
		list1.add(4);
		list1.add(8);
		list1.add(3);

		Iterator<Integer> itr1 = list1.iterator();
		
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	}

}
