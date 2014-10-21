package com.mohit.threads;

public class Test {

	public static void main(String args[]){
	
		String s="INDIA";
		System.out.println(s.hashCode());
		String s1="INDIA";
		System.out.println(s1.hashCode());
		
		if (s1.equals(s))
		{System.out.println("equal");}
		
		String p=new String("INDIA");
		System.out.println(p.hashCode());
		
		
		
		if (s1.equals(p))
		{System.out.println("equal");}
	}
	
}
