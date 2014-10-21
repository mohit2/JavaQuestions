package com.mohit.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorVsForLoop {





	/*	What is an Iterator?
			Iterator is just another java object that lets you iterate over an java collection. Consider it as 
			another  way  to  scan  over  any  java  collection  like  Array/ArrayList/LinkedList  etc.  Yes  you  can 
			always use our  favorite  foreach loop to scan over the collection, but sometimes we may need 
			to  modify  the  collection  while  in  iteration,  here  the  iterator  comes  to  our  rescue.  We  can 
			remove the element from the iterator while being inside the iteration (iterators are fail fast), 
			the foreach loop would blow off in this situation with a ConcurrentModificationException.
	 */

	public static void main(String args[])
	{
		ArrayList<String> myCollection = new ArrayList<String>();
		myCollection.add("Some Value");
		myCollection.add("Another Value");
		myCollection.add("Third Value");
		System.out.println(myCollection);
		
		Iterator iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			String item = (String) iterator.next();
			if (item.equals("Third Value")) {
				/** note: its iterator.remove() and 
			not myCollection.remove() **/
				iterator.remove(); 
			}
		
		
		
		}
		
		System.out.println(myCollection);
		myCollection.add("Third Value");
		System.out.println("adding third value again"+myCollection);
		
		for(String item : myCollection){
			if (item.equals("Third Value")) {
				/** we’ll get ConcurrentModificationException here **/
				myCollection.remove(item);
			}
		}
		System.out.println(myCollection);
	}






}
