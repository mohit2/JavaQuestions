package com.mohit.customException;
/*
 * Simply extend the Exception class or any other sub class of the class Exception, and now you are 
ready  to  throw  any  exception  of  your  own  class  from  your  code.  For  passing  message  along 
with  your  Exception  class,  you  can  simply  add  a  constructor  that  takes  in  a  parameter  and 
passes it to its super class’s constructor by the super() call.
 */

 class MyException  extends Exception{

	public MyException(){
		super(); 
		
	}
	public MyException(String message){
		super(message);
	}
}
public class TestClass {
	public static void main(String[] a) throws MyException{
		throw new MyException("I dont like ur name");
	}


}
