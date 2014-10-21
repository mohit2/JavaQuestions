package com.mohit.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Employee implements Serializable {
 
//  private static final long serialVersionUID = -6470090944414208496L;
     
    private String name;
    private int id;
    transient private int salary;
//  private String password;
     
    @Override
    public String toString(){
        return "Employee{name="+name+",id="+id+",salary="+salary+"}";
    }
     
    //getter and setter methods
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public int getSalary() {
        return salary;
    }
 
    public void setSalary(int salary) {
        this.salary = salary;
    }
 
//  public String getPassword() {
//      return password;
//  }
//
//  public void setPassword(String password) {
//      this.password = password;
//  }
     
}

public class SerializationUtil {


		// TODO Auto-generated method stub
		
		public static Object deSerialize(String filename) throws IOException, ClassNotFoundException{
			
			FileInputStream fis= new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object object = ois.readObject();
			ois.close();
			
			return object;
	
	}
		
		public static void serializeObject(Object o,String filename) throws IOException{
			FileOutputStream fos = new FileOutputStream(filename);
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(o);
	 
	        fos.close();
		}

}
