package com.mohit.classloading;

public class StsticBlockMethodVariableTest {

	
	
		/** A static variable */
		private static int num;
		/** A static block */
		static
		{ 
		num = 20;
		System.out.println("Inside static block");
		}
		/** Constructor */
		public StsticBlockMethodVariableTest(){
		System.out.println("Inside Constructor"); 
		}
		public static void myStaticMethod(){ 
		System.out.println("Inside static func");
		}
		public void myNonStaticMethod(){
		System.out.println("Inside non static func");
		}
		public static void main(String[] args){
		StsticBlockMethodVariableTest.myStaticMethod();
		StsticBlockMethodVariableTest test = new StsticBlockMethodVariableTest();
		test.myNonStaticMethod();
		} 
		
	
	
}
