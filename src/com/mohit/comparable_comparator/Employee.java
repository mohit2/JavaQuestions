package com.mohit.comparable_comparator;
/*
 * Comparable needs the Employee Class itself to be modified, hence there is more 
coupling.  Whereas  the  Comparator  is  a  pluggable  component  which  does  not  nood  to 
modify your Employee class to be modified.

Below are few common situations using Comparable & Comparator :
  Comparable can be used when you’re comparing the instances of the same class, whereas 
comparable  would  be  of  use  when  you  are  comparing  two  different  class’s  objects  like  of 
class Employee and class Politician. Who do you think would have more salary ?
  If the sorting/comparison is a very obvious and common in your application and is going to 
be used very frequently - use Comparable.
  If the comparison is not very clear and it might not be used very frequently, on a sa fe side go 
for a Comparator. Its cool to have the comparator outside your class.  Its less coupled and 
and more simpler to maintain by some other person.
  If  there  are  more  than  one  Comparison  policies  (i.e  by  salary,  by  age,  by  hmm..  yrs.  of 
experience)  then  its  better  to  have  a  comparator,  where  you  can  have  all  your  code  in  a 
separate external class.
 */

import java.util.Comparator;
/*
 * Java provides some inbuilt methods to sort primitive types array or Wrapper
 *  classes array or list. Here we will first learn how we can sort an array/list 
 *  of primitive types and wrapper classes and then we will use java.lang.Comparable
 *   and java.util.Comparator interfaces to sort array/list of custom classes.
 */

public class Employee implements Comparable<Employee> {
 
    private int id;
    private String name;
    private int age;
    private long salary;
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public long getSalary() {
        return salary;
    }
 
    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    @Override
    public int compareTo(Employee emp) {
        //let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.id);
    }
   
    /**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };
 
    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };
 
    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    }; 
    
    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
 
}