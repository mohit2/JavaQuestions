package com.mohit.serializable;

import java.io.IOException;

public class SerializationUtilTest {
     
    public static void main(String[] args) {
        String fileName="employee.ser";
        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("Pankaj");
        emp.setSalary(5000);
         
        //serialize to file
        try {
        	SerializationUtil.serializeObject(emp, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
         
        Employee empNew = null;
        try {
            empNew = (Employee) SerializationUtil.deSerialize(fileName);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
         
        System.out.println("emp Object::"+emp);
        System.out.println("empNew Object::"+empNew);
    }
 
 
}