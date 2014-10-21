package com.mohit.CodeConcepts;

public class StaticDynamicBindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parent parent = new Parent();
		Parent parentTypeChild1 = new Child1();
		Child1 child1TypeChild1=new Child1();
		
		parent.disp();
		parent.onlyParentsMethod();
		
		parentTypeChild1.onlyParentsMethod();
		parentTypeChild1.disp();
		// this is not allowed parentTypeChild1.onlyChild1Method();
		
		child1TypeChild1.disp();
		child1TypeChild1.onlyChild1Method();
		child1TypeChild1.onlyParentsMethod();
		
		//see how we cane use any types of subtypes
		Parent[] employees = new Parent[] { parent, parentTypeChild1,child1TypeChild1 };
		for (Parent employee : employees) {
		    employee.disp();
		}
		
		
		

	}

}


class Parent{

	public Parent() {
		System.out.println("parents conastructor called");
	}
	public void disp(){
		System.out.println("parents disp called");
	}
	public void onlyParentsMethod(){
		System.out.println("this method  is only in parent ");
	}

}

class Child1 extends Parent{
	public Child1()
	{System.out.println("Child 1 conastructor called");
	}
	public void disp(){
		System.out.println("Child1 disp called");}
	public void onlyChild1Method(){
		System.out.println("this method  is only in Child1 ");
	}
}

class Child2 extends Parent{
	public Child2()
	{System.out.println("Child 2 conastructor called");
	}
	public void disp(){
		System.out.println("Child2 disp called");}
	public void onlyChild2Method(){
		System.out.println("this method  is only in Child2 ");
	}

}