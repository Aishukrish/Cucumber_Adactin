package com.logger.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
	//factory design pattern
	public static Logger Log= Logger.getLogger(Basic_Configuration.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Log.debug("Debug");
		Log.info("Info");
		Log.warn("Warning");
		Log.error("Error");
		Log.fatal("Fatal");
	}

}
