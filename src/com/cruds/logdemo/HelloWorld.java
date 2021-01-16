package com.cruds.logdemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorld {

	static final Logger logger=Logger.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.propperties");
		
		logger.debug("this is debug msg");
		logger.warn("this is warning msg");
		logger.error("this is error msg");
		logger.fatal("this is fatal msg");
		
	}

}
