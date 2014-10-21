package com.mohit.CodeConcepts;

 class StaticDemo{
    static{
        System.out.println("static block of parent class");
    }
}
class StaticDemoChild extends StaticDemo{
    static{
        System.out.println("static block of child class");
    }
    public void display()
    {
        System.out.println("Just a method of child class");
    }
    
    
}


public class StsticBlockInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    StaticDemo o = new StaticDemoChild();
		   // o.display();  { will give error}
		
	        StaticDemoChild obj = new StaticDemoChild();
	        obj.display();
	    /* output
	     * static block of parent class
           static block of child class
           Just a method of child class
	     */

	}

}
