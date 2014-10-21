package com.mohit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		//ARRAYLIST  order of insertion is maintained
		/*
		 * ArrayList in Java implements List interface and allow null. Java ArrayList also
		 * maintains insertion order of elements and allows duplicates opposite to any 
		 * Set implementation which doesn't allow duplicates. ArrayList supports both 
		 * Iterator and ListIterator for iteration but it’s recommended to use
		 * ListIterator as it allows the programmer to traverse the list in either 
		 * direction, modify the list during iteration, and obtain the Iterator's current
		 * position in the list.


		 */
		List<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		list.add(2, "D");
		System.out.println(list.get(2));
		//looping the list in for loop
		for(String s:list)
		{
			System.out.println(s);
		}
		//looping with iterator
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{System.out.println(iterator.next());}
		try{
		Collections.sort(list);
		Collections.sort(null); // null list throws null pointer exception
		}
		catch (NullPointerException e){
			System.out.println(e);
		}
		System.out.println("sorted list is "+list);
		
		ArrayList<String> copyOfStringList = new ArrayList<String>();
		copyOfStringList.addAll(list);
		System.out.println("copied list is "+copyOfStringList);

/*
 1) ArrayList is not a synchronized collection hence it is not suitable to be used between multiple threads concurrently. If you want to use ArrayList then you need to either use new CopyonWriteArrayList or use Collections.synchronizedList() to create a synchronized List.

2) CopyonWriteArrayList is recommended for concurrent multi-threading environment as it is optimized for multiple concurrent read and creates copy for write operation.

3) When ArrayList gets full it creates another array and uses System.arrayCopy() to copy all elements from one array to another array.

4) Iterator and ListIterator of Java ArrayList are fail-fast it means if ArrayList is structurally modified at any time after the Iterator is created, in any way except through the iterator's own remove or add methods, the Iterator will throw a ConcurrentModificationException. Thus, in the face of concurrent modification, the Iterator fails quickly and cleanly, that's why it’s called fail-fast.

5) ConcurrentModificationException is not guaranteed and it only thrown at best effort.
6) If you are creating Synchronized List it’s recommended to create while creating instance of underlying ArrayList to prevent accidental non synchronized access to the list. 

7) An application can increase the capacity of an ArrayList instance before adding a large number of elements using the ensureCapacity() operation. This may reduce the amount of incremental reallocation due to incremental filling of ArrayList.

8) The size(), isEmpty(), get(), set(), iterator(), and listIterator() operations run in constant time because ArrayList is based on Array but adding or removing an element is costly as compared to LinkedList.

9) ArrayList class is enhanced in Java 1.5 to support Generics which added extra type-safety on ArrayList. It’s recommended to use generics version of ArrayList to ensure that your ArrayList contains only specified type of element and avoid any ClassCastException.

10) Since ArrayList implements List interface it maintains insertion order of element and allow duplicates.

11) If we set ArrayList reference null in Java all the elements inside ArrayList becomes eligible to garbage collection in java , provided there are no more reference exists for those objects.

12) Always use isEmpty() method to check if ArrayList is empty or not, instead of using size() == 0 check. Former one is much more readable, as shown below


	*/	
		
		//Vectors 
		
		

	}

}
