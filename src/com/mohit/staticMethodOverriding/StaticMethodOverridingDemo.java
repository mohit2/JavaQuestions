package com.mohit.staticMethodOverriding;

class Parent {
	public static void parentsStatic(){
		System.out.println("parents static method");
	}
	
	public  void parentsNormal(){
		System.out.println("parents normal  method");
	}
}

class Child extends Parent {
	public static void parentsStatic(){
		System.out.println("Childs overriden parents static method");
	}
	public  void parentsNormal(){
		System.out.println("childs overriden  normal  method  child");
	}
}

public class StaticMethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent=new Child();
		Child child = new Child();
		parent.parentsStatic();
		parent.parentsNormal();
		child.parentsStatic();
		child.parentsNormal();
		
		/*
		 * so basically even if yu override static method , it just hides the method.
		 * but when you call the method via Parent parent = new child()  , 
		 * it will show parents static method only !
		 */

	}

}
