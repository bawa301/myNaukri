package com.naukri.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	
	public String naukriCred(String key) throws Throwable 
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources/data/naukri.property");
		Properties p = new Properties();
		p.load(fis);
		String re = p.getProperty(key);
		return re;
	}

}
