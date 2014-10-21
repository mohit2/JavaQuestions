package com.mohit.CodeConcepts;

/*
 * when we provide a parameterized constructor and dont provide default , error
 * if we call default constructor , since compiler doesnt provide that time .
 * 
 * Static constructors are not allowed in java , since they cant be overriden in child classes
 */

public class ConstructorTest {

	public static void main(String args[] )
	{
		ParentConstructor pconst= new ParentConstructor();
		System.out.println("");
		ParentConstructor cconst= new ChildConstructor();
		System.out.println("");
		ChildConstructor child= new ChildConstructor();
		System.out.println("\n moving to overloaded");
		ParentConstructor pconst1= new ParentConstructor("hello");
		System.out.println("");
		ParentConstructor cconst1= new ChildConstructor("hi");
		System.out.println("");
		ChildConstructor child1= new ChildConstructor("bye");
		
		
		
	}
}

class ParentConstructor {

	public ParentConstructor(){
		System.out.println("This is default parent constructor");
	};

	public ParentConstructor(String msg){
		System.out.println("This is overloaded parent constructor with string:"+msg);
	};
}

class ChildConstructor extends ParentConstructor
{
  public ChildConstructor(){
	  System.out.println("This is default child constructor");
  };
  public ChildConstructor(String arg){
	  System.out.println("This is overloaded child constructor with string "+arg);
  };
}

