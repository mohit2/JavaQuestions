package com.mohit.programming;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rev="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any string to reverse");
		String orig=scanner.next();
		
		rev=ReverseIt.reverse(orig);
		System.out.println("reversed string is "+rev);
		System.out.println("reversed string using reversebuilder is "+ReverseIt.reverseStringBuilder(orig));
		System.out.println("reversed string using string buffer  is "+ReverseIt.reverseStringBuffer(orig));
		
	System.out.println("reversed string using recursion is "+ReverseIt.reverseRecursively(orig));
	

	}

}

class ReverseIt{
	
	static  String reverse(String s){
	String reversed="";
	for(int i=s.length()-1;i>=0;i--){
	reversed=reversed+ s.charAt(i);
	}
	return reversed;
	}
	
	static String reverseRecursively(String s){
		
		if(s.length() == 0)
		     return "";
		   return s.charAt(s.length() - 1) + reverseRecursively(s.substring(0,s.length()-1));
		}
	
	static String reverseStringBuffer(String s){
		return new StringBuffer(s).reverse().toString();
		}
	static String reverseStringBuilder(String s){
		return new StringBuilder(s).reverse().toString();
		}
	

}
