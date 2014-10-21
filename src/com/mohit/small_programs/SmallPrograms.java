package com.mohit.small_programs;

public class SmallPrograms {
	/* Q1>Given a string, return true if the first instance of "x" in the string is immediately followed by another "x". 
	doubleX("axxbb") → true
	doubleX("axaxax") → false
	doubleX("xxxxx") → true
 */
	boolean doubleX(String str) {
		  int i = str.indexOf("x");
		  if (i == -1) return false; // no "x" at all

		  // Is char at i+1 also an "x"?
		  if (i+1 >= str.length()) return false; // check i+1 in bounds?
		  return str.substring(i+1, i+2).equals("x");
		  
		  // Another approach -- .startsWith() simplifies the logic
		  // String x = str.substring(i);
		  // return x.startsWith("xx");
		}

	
	//Tip :: str.substring(i, i+1); alternatve to charAt()
	
	/*Q2>Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring). 
	last2("hixxhi") → 1
	last2("xaxxaxaxx") → 1
	last2("axxxaaxx") → 2 
	 */
	public int last2(String str) {
		  // Screen out too-short string case.
		  if (str.length() < 2) return 0;
		  
		  String end = str.substring(str.length()-2);
		  // Note: substring() with 1 value goes through the end of the string
		  int count = 0;
		  
		  // Check each substring length 2 starting at i
		  for (int i=0; i<str.length()-2; i++) {
		    String sub = str.substring(i, i+2);
		    if (sub.equals(end)) {  // Use .equals() with strings
		      count++;
		    }
		  }

		  return count;
		}
	
	/*Q3>
	 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap. 
		stringYak("yakpak") → "pak"
		stringYak("pakyak") → "pak"
		stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str) {
		  String result = "";
		  
		  for (int i=0; i<str.length(); i++) {
		    // Look for i starting a "yak" -- advance i in that case
		    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
		      i =  i + 2;
		    } else { // Otherwise do the normal append
		      result = result + str.charAt(i);
		    }
		  }
		  
		  return result;
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}

}
