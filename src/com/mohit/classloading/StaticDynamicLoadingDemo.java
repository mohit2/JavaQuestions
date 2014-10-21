package com.mohit.classloading;

public class StaticDynamicLoadingDemo {

	    static {
	        System.out.println("Class A loaded...");
	    }

	    public static void main(String[] args) throws ClassNotFoundException {
	        // static class loading
	        B b = new B();

	        // dynamically / programmatically loading class
	        Class.forName("C");
	    }
	}

	class B {
	    static {
	        System.out.println("Class B loaded...");
	    }
	}

	class C {
	    static {
	        System.out.println("Class C loaded...");
	    }
	}



