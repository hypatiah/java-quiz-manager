package fr.epita.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * A singleton class to configure database application properties
 * @author daniellehassid
 *
 */
public class Configuration {

	private Properties properties;
	
	private static Configuration configuration;

	private Configuration() {
		try {
			properties.load(new FileInputStream(new File("application.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Configuration getInstance() {
		// if there is no instance yet
		if (configuration == null) {
			// initialize configuration
			configuration = new Configuration();
		}
		return configuration;
	}
	
	public String getPropertyValue(String key) {
		return properties.getProperty(key);
	}
}