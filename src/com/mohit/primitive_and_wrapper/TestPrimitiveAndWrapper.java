package com.mohit.primitive_and_wrapper;

public class TestPrimitiveAndWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =12;
		int b=12;
		System.out.println(a==b);
		Integer c=12;
		Integer d=12;
		Integer e= new Integer(12);
        System.out.println(a==c);
        System.out.println(c.equals(a));
        System.out.println(e.equals(a));
        System.out.println(e.equals(c));
        System.out.println(e==a);
        
        String s1 = "mohit";
        String s2 = "mohit";
        String s3=new String("mohit");
        System.out.println("s1=mohit s2=mohit s3=new String");
        System.out.println("is s1==s2 ");
        System.out.println(s1==s2);
        System.out.println("is s1.equals(s2)"+s1.equals(s2));
        System.out.println("is s1==s3");
        System.out.println(s1==s3);
        System.out.println("is s1.equals(s3)"+s1.equals(s3));
        
        Integer i1= new Integer(1);
        Integer i2= new Integer(1);int i3=1;
        System.out.println(i1==i2);
        System.out.println(i1==i3);
        System.out.println(i1.equals(i2));
        
	}
	
	

}
