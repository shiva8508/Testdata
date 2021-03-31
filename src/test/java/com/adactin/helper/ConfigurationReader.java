package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;
	public ConfigurationReader() throws IOException {

		File f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}
	
	public static String getBrowser() {
		String browser = p.getProperty("browsername");
		return browser;

	}
	
	public static String getUrl() {
		String url = p.getProperty("url");
		return url;

	}

	
	}

