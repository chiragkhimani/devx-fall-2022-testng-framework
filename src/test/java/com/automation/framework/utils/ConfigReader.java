package com.automation.framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	static Properties prop = new Properties();

	public ConfigReader() {
		try {
			prop.load(new FileInputStream(
					new File(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}

}
