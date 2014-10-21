package com.mohit.equals_hashcode;

/*
 * 
 * Hashmaps are a classic example. It's imperative that the key to a map be 
 * immutable. If the key is not immutable, and you change a value on the key
 *  such that hashCode() would result in a new value, the map is now broken
 *   (a key is now in the wrong location in the hash table.).
 * 
 * Q: What if I always return a constant value in the hashCode method (say return 1). Does that 
satisfy the Contract ? 

Yes  the  contract  is  satisfied,  since  we  are  always  returning  a  constant  value  from  the 
hashCode() method, any two equal objects would also have the same hashCode() value, hence 
the contract is satisfied.

But, as  we have seen in above diagram,  every object is going to have the same hashcode, so 
when Java uses the hashcode in the hashing  algo, every objects tends to return a same value, 
hence every object is put in the same bucket  in a very long LinkedList.  It is equivalent to having 
a long array of elements. So where are we taking advantage of the performance of Hashing ?

Q: Can you write a better HashMap than java ?
A: Well we can definitely give some suggestion for a better HashMap implementation. As we 
know java keeps LinkedList for all inner buckets, so finding any element on that LinkedList is an 
O(n) time operation, since in linked lists we need to traverse through every element to reach to 
the N-th element.
A suggestion can be to maintain a Binary Search tree instead of the LinkedList, so we can reduce 
the insert/retrieval operation’s time to O(logN), which is a significant improvement
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
//employee class overrides only equals
 class Employee
{
  /*  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

	private Integer id;
    private String firstname;
    private String lastName;
    private String department;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}

 class EmployeeEqualsImplemented
 {
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEqualsImplemented other = (EmployeeEqualsImplemented) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString(){
		return  "Employee id "+this.getId().toString();
		
		
	}
	private Integer id;
     private String firstname;
     private String lastName;
     private String department;

     public Integer getId() {
         return id;
     }
     public void setId(Integer id) {
         this.id = id;
     }
     public String getFirstname() {
         return firstname;
     }
     public void setFirstname(String firstname) {
         this.firstname = firstname;
     }
     public String getLastName() {
         return lastName;
     }
     public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     public String getDepartment() {
         return department;
     }
     public void setDepartment(String department) {
         this.department = department;
     }
 
 }

public class EqualsTest {

	/*  if equals is not overridden, it defaults to the Object#equals(Object o) method.
	 *  Per the Object API this is the same as ==; that is, it returns true if and 
	 *  only if both variables refer to the same object, if their references are 
	 *  one and the same.
	 *  
	 *  The default equals() method on java.lang.Object compares memory addresses, 
	 *  which means that all objects are different from each other (only two
	 *  references to the same object will return true).java.lang.Integer overrides 
	 *  this to compare the value of the Integers, so two different Integers both
	 *  representing the number two compare equal. If you used == instead, you 
	 *  would get false for both cases. 
	 */
	
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.setId(100);
        e2.setId(100);
        e3.setId(200);
        //Prints false in console , since memory location different , using default equals
        System.out.println(e1.equals(e2));
        Map map=new HashMap();
        map.put(e1, e1.getId());map.put(e2, e2.getId());map.put(e3, e3.getId());
        //see output has 3 entries , rather should have 2 only :)
        System.out.println(map);
        
        EmployeeEqualsImplemented emp1 = new EmployeeEqualsImplemented();
        EmployeeEqualsImplemented emp2 = new EmployeeEqualsImplemented();

        emp1.setId(100);
        emp2.setId(100);
        //Prints true in console , since using overridden method
        System.out.println(emp1.equals(emp2));
        //now make sure to override hashcode method, as equal objects should 
        //always have same hashcode , but since default hashcode is implemented using 
        //memory address , its different for two equal object 
        
        Set empSet=new HashSet();
        empSet.add(emp1);
        empSet.add(emp2);
       System.out.println(empSet);
       /*this prints 2 objects if we dont override hashcode in EmployeeEqualsImplemented class
       //but that should not be the case , so we override equals using some algo
       //and same fields that we use in the comparing the equals so that 
       //hashcode turns to be same
        NOW if we use this employee object as key-value in hashmap/hashset, and 
        we see hat instead of one , two different objects will be stored
        
        
        Q-What happens if we override equals() method without overriding 
		hashCode() method?
		Ans: it will work while comparing two objects
		but if we use it as key in hashmap , then
		
		java  hashing  algo  would  not  respect  the  equals()  method  while  comparing  equality  of  two 
		objects; even if the equals() method is present in the class and two objects are equal.
		Java  would  use  the   hashCode()  and  equals()  method  for  implementing  its  hashing 
		mechanism. The  hashCode()  method  is  called before the  equals()  method. Two  objects 
		are equal if and only if they pass both the hashcode and equals test.
		       
        * so what if we override only hashcode?
        * well in that case , nothing actually happens -- if new hashcode method evaluates
        * same for two objects , they will be chained internally as linked list/array list and will 
        * then use equals method to retain object
        */
       
       
       /*Now what happens if state of object changes , then the newly written Hashcode is
        * called to recalculate the hashcode and at new place data is stored , so we 
        * prefer immutable objects in that case if we want to store that object as key in maps
        * 
        */
       
       
       
       /*
        * - Here comes the main part. Now, as we know that two unequal objects 
        * can have same hash code value, how two different objects will be stored
        *  in same array location [called bucket].Answer is LinkedList. If you 
        *  remember, Entry class had an attribute “next”. This attribute always
        *   points to next object in chain. This is exactly the behavior of 
        *   LinkedList.
        *   So, in case of collision, Entry objects are stored in LinkedList form. 
        *   When an Entry object needs to be stored in particular index, HashMap 
        *   checks whether there is already an entry?? If there is no entry already
        *    present, Entry object is stored in this location.If there is already
        *     an object sitting on calculated index, its next attribute is checked. 
        *     If it is null, and current Entry object becomes next node in 
        *     LinkedList. If next variable is not null, procedure is followed 
        *     until next is evaluated as null.
        */
    }
}


