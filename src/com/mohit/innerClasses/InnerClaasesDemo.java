package com.mohit.innerClasses;

/*
 * Inner classes, also known as the Nested Classes,  are nothing but classes enclosed inside some 
other parents class. Now the class can be present in two places in a parent class :
  In the class itself as instances are declared.
  Inside some method of the parent class.
Based on their presence location and access, there are 4 types of inner classes:
  Inner classes (Normal)
  Static Inner classes
  Local Inner classes
  Anonymous Inner classes.
While the first two fall in the 1st category (declared directly inside class) , the other two fall in 
the 2nd type (declared inside some method). 
 */

/*
 * Now let’s read what makes Inner classes so special :
The inner class can access all the attributes of its parent class, even the private methods 
and  variables.  And  similar  is  true  for  Parent  class.  The  parent  class  can  also  access 
private fields of the inner class.
Syntax for Parent class accessing Inner class’s private fields :
InnerClass inner = newInnerClass();
inner.privateMethod();
Syntax for Inner class accessing Parent class’s private fields :
ParentClass.this.privateMethod();
 */


/** Programmer : The Outer Class **/
class Programmer{
	private String name;
	private void someOuterFunction(){
		System.out.println("Inside private method of Outer class");
		InnerProgrammer inner = new InnerProgrammer();
		inner.language = "New Language";
		inner.someInnerFunction();
	}
	/** InnerProgrammer : The Inner Class **/
	class InnerProgrammer{
		private String language;
		private int age;
		private void someInnerFunction(){
			System.out.println("Inside private method of Inner class");
			Programmer.this.name = "New Name";
			Programmer.this.someOuterFunction();
		} 
	}
	/** End of Inner Class **/   

}
/** USAGE **/
public class InnerClaasesDemo{
	public static void main(String[] args){
		Programmer.InnerProgrammer inner
		= (new Programmer()).new InnerProgrammer();
	}
}

