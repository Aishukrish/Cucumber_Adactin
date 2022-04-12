package com.logger.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {
	//factory design pattern
		public static Logger Log= Logger.getLogger(Property_Configuration.class);
		public static void main(String[] args) {
			PropertyConfigurator.configure("log4j.properties");
			Log.debug("Debug");
			Log.info("Info");
			Log.warn("Warning");
			Log.error("Error");
			Log.fatal("Fatal");
		}

}
