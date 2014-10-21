package com.mohit.immutable;


public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Mohit";
		String p = new String("Mohit");
		System.out.println(s.equals(p)); // will be true since it compares 2 distinc object with equals method
		
		System.out.println(s==p); //will be false since the two references s and p point
		//to two different objects
		
		String x = "hello";
		String y = "he" + "llo";
		System.out.println(x == y); // true!
		/*
		 * Additionally, it's worth being aware that any two equal string constants
		 *  (primarily string literals, but also combinations of string constants via 
		 *  concatenation) will end up referring to the same string. For example
		 */
	}

}

/*
 
 Before proceeding further with the fuss of Immutability, just take a look into String class and its functionality a little before coming to conclusion about its immutability.

This is how String works.

    `String str = "knowledge"`;
This as usual, creates a string named "knowledge" and assign it a reference "str". Simple enough? Lets perform some more functions:

 String s = str ;     // assigns a new reference to the same string "knowledge"
Lets see how below statement works:

  str = str.concat(" base");
This, appends a string " base" to str . But wait, how is this possible since String objects are immutable ? Well to your surprise, it is.

When the above statement is executed, VM takes the value of String str, i.e. "knowledge" and append " base", giving us the value "knowledge base". Now since Strings are immutable, VM can't assign this value to "str" so it creates a new String Object, gives it a value "knowledge base" and gives it a reference "str" .

Important point to note here is, while the String object is immutable, its reference variable is not. So that's why in above example, it was made to refer newly formed String Object.

At this point in the example above, we have two String Objects, the first one we created with value "knowledge", pointed to by 's' and second one "knowledge base" pointed to by 'str'. But technically we have three String Object, third one being the literal "base" in concat statement.

Important Facts about String and Memory usage

What if we didn't have another reference 's' to "knowledge", we would have lost that String. However it still would have exist but would be considered lost due to no reference. Look at one more example below

String s1 = "java";
s1.concat(" rules");
System.out.println("s1 refers to "+s1);  // Yes, s1 still refers to "java"
Whats happening :

First line is pretty straight forward, create a new String "java" and refer s1 to it.
Next, the VM creates another new String "java rules" but nothing refers to it. So, second String is instantly lost. We can't reach to it.
The reference variable s1 still refers to original String "java".

Almost each method, applied to a String object in order to modify it, creates new String object. So, where do these String objects go ? Well these exists in memory and one of the key goal of any programming language is to make efficient use of memory.

As applications grows, its very common for String literals to occupy large area of memory which can even cause redundancy. So, in order to make java more efficient, JVM sets aside a special area of memory called "String constant pool".

When compiler sees a String literal, it looks for the String in the pool. If match is found, the reference to the new literal is directed to the existing String and no new String object is created. The existing String simply has one more reference. Here comes the point of making String object as immutable.

In the String constant pool, a String object is likely to have one or many references. If several references point to same String without even knowing it, it would be bad if one of the references modifies a String value. That's why String objects are immutable.

Well now you could say that what if someone overrides the functionality of String class? That's again the reason that String class is marked Final so nobody could override the behavior of String methods.

Cheers!
 
 */
