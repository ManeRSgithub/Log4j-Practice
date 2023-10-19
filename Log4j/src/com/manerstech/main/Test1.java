package com.manerstech.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Application Started...");
   
    BasicConfigurator.configure();
    Logger logger=Logger.getLogger("Test1");
    
    logger.fatal("This is FATAL message...");
    logger.error("This is ERROR message...");
    logger.warn("This is WARNING message...");
    logger.info("This is INFO message...");
    logger.debug("This is DEBUG message...");
    logger.trace("This is TRACE message");
    
    
    System.out.println("Application Ended...");
	}

}
