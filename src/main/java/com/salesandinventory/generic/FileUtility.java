package com.salesandinventory.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
/**
 * This method helps to read the data from property file
 * @param key
 * @return
 * @throws IOException
 */
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IpathConstants.propertyFilePath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
