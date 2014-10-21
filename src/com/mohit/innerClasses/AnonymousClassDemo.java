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
 * Anonymous  Inner  classes  are  special  type  of  Local  Inner  class  where  we  don’t  even  create  a 
class definition, but instead  write the code of class on the go.  Anonymous classes are generally 
used for single-use scenarios, so we do not bother creating the class formally. 
But, creating anonymous inner class requires an interface or super class structure before 
we can use it
 */
interface Programmer1{
	public void writeCode();
	public void drinkCoffee();
}

class ParentClass{
	private String name="Bond";
	public void someMethod(){
		class LocalInnerClass{
			private void doSomething(){
				System.out.println("Lol, I can see ur private fields : "
						+ParentClass.this.name);
			}
		}
		/** Anonymous Class **/
		new Programmer1(){
			@Override
			public void writeCode() { 
				System.out.println("Lol, I can see ur private fields : "
						+ParentClass.this.name);
				System.out.println(ParentClass.this.name
						+" is coding hard");
			}
			@Override
			public void drinkCoffee() {
				System.out.println("Lol, I can see ur private fields : "
						+ParentClass.this.name);
				System.out.println(ParentClass.this.name
						+" is drinking coffee");
			}};
			/** End of Anonymous Class **/
	}
}
public class AnonymousClassDemo {

}
