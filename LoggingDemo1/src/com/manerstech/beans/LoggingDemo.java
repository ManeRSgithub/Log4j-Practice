package com.manerstech.beans;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started...");
		
		try {
			FileHandler file_handler=new FileHandler("E:\\MyLog.log",true);
			SimpleFormatter formatter=new SimpleFormatter();
			file_handler.setFormatter(formatter);
			
			Logger logger= Logger.getLogger("LoggingDemo");
			logger.addHandler(file_handler);
			
			logger.log(Level.SEVERE, "This is SEVERE message...");
			logger.log(Level.WARNING, "This is WARNING message...");
			logger.log(Level.INFO, "This is INFO message...");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main method ends...");
	}

}
