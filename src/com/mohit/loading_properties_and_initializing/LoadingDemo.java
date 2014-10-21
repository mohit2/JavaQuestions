package com.mohit.loading_properties_and_initializing;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;



public class LoadingDemo {
    
    public static final String DOMAIN_PACKAGE; //we leave it uninitialized on purpose.

    static {
    	Properties config=new Properties();
    	try {
    		
			InputStream inputStream = LoadingDemo.class.getClassLoader().getResourceAsStream("initialConfig.properties");
			config.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        DOMAIN_PACKAGE = config.getProperty("memory");
    }
    
    
    public static void main (String args[]){
    	System.out.println("Present working dir: "
    			+ new File(".").getAbsolutePath());
    	System.out.println(DOMAIN_PACKAGE);
    	
    	/** Iterating over all the properties */
    	Properties properties=new Properties();
try {
    		
			InputStream inputStream = LoadingDemo.class.getClassLoader().getResourceAsStream("initialConfig.properties");
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Enumeration enuKeys = properties.keys();
    	// another way Set set =properties.keySet();
    	while (enuKeys.hasMoreElements()) {
    	String key = (String) enuKeys.nextElement(); 
    	String value = properties.getProperty(key);
    	System.out.println(key + ": " + value);
    	}
    	
    }
    
}