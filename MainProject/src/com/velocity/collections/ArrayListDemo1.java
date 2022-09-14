package com.velocity.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<String>();
	list.add("suhas");
	list.add("suraj");
	list.add("sudam");
	list.add("suyash");
	
	Iterator<String> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	
	

	}

}
