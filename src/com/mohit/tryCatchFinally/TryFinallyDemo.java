package com.mohit.tryCatchFinally;


public class TryFinallyDemo {
	public static int testMethod()
	{
		try
		{
			return 1;
		}
		finally
		{
			return 2;
		}
	}
	public static void main(String[] args){
		System.out.println(testMethod());
	}
}

