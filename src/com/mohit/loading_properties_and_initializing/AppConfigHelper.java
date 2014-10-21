package com.mohit.loading_properties_and_initializing;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class AppConfigHelper {
	
	/*
	 * remember final can be initialized just once 
	 * 
	 */
	public  final int  memory;
	public  final int  maxSize;
    
	public int getMemory() {
		return memory;
	}
    public int getMaxSize() {
		return maxSize;
	}
	
	public AppConfigHelper(String propFileName){

		Properties config=new Properties();
		try {

			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			System.out.println(inputStream.toString()); 
			config.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.memory=Integer.parseInt(config.getProperty("memory"));    
		this.maxSize=Integer.parseInt(config.getProperty("maxSize"));    

	}


}
