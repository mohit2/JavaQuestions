package com.mohit.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Employee1 implements Comparable {
	public String name;
	public int salary;
	public int compareTo(Object emp) {
		return this.salary - ((Employee1)emp).salary;
	}
}

class SalaryComparator implements Comparator{
	public int compare(Object e1, Object e2) {
		return ((Employee1)e1).salary- ((Employee1)e2).salary;
	}
}


public class AnotherExampleBoth {

	public static void main(String args[]){
		List<Employee1> myEmpList = new ArrayList<Employee1>();
		Employee1 emp = new Employee1();
		emp.salary = 5000;
		emp.name = "Arnold";
		myEmpList.add(emp);
		emp = new Employee1();
		emp.salary = 15000;
		emp.name = "Clooney";
		myEmpList.add(emp);
		emp = new Employee1();
		emp.salary = 500;
		emp.name = "Brad";
		myEmpList.add(emp);
		/** Comparable **/
		Collections.sort(myEmpList);
		/** Comparator **/
		Collections.sort(myEmpList, new SalaryComparator());
	}

}
