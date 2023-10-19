package com.manerstech.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application Started...");
		
		PropertyConfigurator.configure("E:\\Spring Framework (New)\\Eclipse Workspace  New\\Log4j\\src\\com\\manerstech\\resources\\Log4j.properties");
	
		Logger logger=Logger.getLogger("Test2");
		logger.fatal("This is fatal error");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.info("This is info message");
		logger.debug("This is debug message");
		
		
		System.out.println("Application Ended...");
	}

}
