package com.mohit.immutabl;
import java.util.ArrayList;
import java.util.List;
/*
 * Hashmaps are a classic example. It's imperative that the key to a map be 
 * immutable. If the key is not immutable, and you change a value on the key
 *  such that hashCode() would result in a new value, the map is now broken
 *   (a key is now in the wrong location in the hash table.).
 *   
 *   example take an existing map , read object key , change a field used to
 *   calculate hashcode, put tit back in map ..it wont override equals
 */


class ImmutableClass {
	String strVal;
	int intVal;
	List listVal;
	public ImmutableClass(String strVal, int intVal, List listVal) {
		this.strVal = strVal;
		this.intVal = intVal;
		this.listVal = listVal;
	}
	/**
	 * Getters for the fields.
	 */
	public String getStrVal() {
		/**
		 * String can be returned directly here, since this string cannot be
		 * modified by the returned value.
		 */
		return strVal;
	}
	public int getIntVal() {
		/**
		 * primitives can be returned directly here, 
		 * since this primitive cannot
		 * be modified by the returned value.
		 */
		return intVal;
	} 

	public List getListVal() {
		/**
		 * Any external code can change the list from the reference, by the
		 * .add(), .remove() methods over the reference. So, return a copy of
		 * the list instead of direct reference.
		 */
		return new ArrayList(listVal);
	}
	/**
	 * Do not provide any setters for any instance variables.
	 */
}

public class ImmutableDemo {

	public static void main(String args[]){

	}

}
