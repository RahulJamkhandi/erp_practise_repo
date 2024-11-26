package com.erp.ess.generic.fileutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPropertiesFile(String key) throws Exception {
		FileInputStream stream = new FileInputStream("./src/test/resources/application.properties");
		Properties properties = new Properties();
		properties.load(stream);
		String data = properties.getProperty(key);
		return data;
	}

}
