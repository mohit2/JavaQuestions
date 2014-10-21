package com.mohit.loading_properties_and_initializing;

import java.io.IOException;
import java.util.Properties;

public class LoadConfig {

	public static void main (String args[])
	{

		AppConfigHelper runner= new AppConfigHelper("initialConfig.properties");
		System.out.println(runner.getMaxSize());
		System.out.println(runner.getMemory());
		
	}
}

