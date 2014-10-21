package com.mohit.CodeConcepts;

/*
 * when we provide a parameterized constructor and dont provide default , error
 * if we call default constructor , since compiler doesnt provide that time .
 * see below codes error to see the same
 */

public class ConstructorTest2 {

	public static void main(String args[] )
	{
		//ParentConstructor1 pconst= new ParentConstructor1();
		/**this line throws error , if we supply parameterized constructor , it 
		 would not supply default constructor**/
		ParentConstructor1 cconst= new ChildConstructor1("k");
		ChildConstructor1 child= new ChildConstructor1("hi");
		
		ParentConstructor1 pconst1= new ParentConstructor1("hello");
		ParentConstructor1 cconst1= new ChildConstructor1("hi");
		ChildConstructor1 child1= new ChildConstructor1("bye");
		
		
		
	}
}

class ParentConstructor1 {

	public ParentConstructor1(String msg){
		System.out.println("This is overloaded parent constructor with string:"+msg);
	};
}

/*class ChildConstructor1 extends ParentConstructor1
{
  public ChildConstructor1(){
	  System.out.println("This is default child constructor");
  };
  public ChildConstructor1(String arg){
	  System.out.println("This is overloaded child constructor with string "+arg);
  };
}*/



class ChildConstructor1 extends ParentConstructor1
{ 
	ChildConstructor1(String arg){
	      super(arg);
		  System.out.println("This is overloaded child constructor with string "+arg);
	  };
	}