package com.manerstech.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("App started...");
		
		PropertyConfigurator.configure("E:\\Spring Framework (New)\\Eclipse Workspace  New\\Log4j\\src\\com\\manerstech\\resources\\Log4j.properties");
		
		Logger logger=Logger.getLogger("Test3");
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.info("This is Info message");
		logger.debug("This is debug message");
		logger.trace("This is trace message");
		
		
		
		
		
		System.out.println("App ended...");
	}

}
