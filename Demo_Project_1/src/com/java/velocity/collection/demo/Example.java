package com.java.velocity.collection.demo;

import java.util.HashSet;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
	
	 HashSet hs = new HashSet();
	 hs.add("Ram");
	 hs.add("Shyam");
	 hs.add("Shital");
	 
	 Iterator itr =hs.iterator();
	 
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
		
	}

}
