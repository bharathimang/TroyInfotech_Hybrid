package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import tests.Base;

public class ConfigUtility extends Base {
	
	public ConfigUtility() throws Throwable {
		File file=new File("src/test/resources/Config.properties");
		FileReader reader=new FileReader(file);
		prop=new Properties();
		prop.load(reader);
	}
	
	public String getURL() {	
		return prop.getProperty("url");
	}
	
	public String getDriverPath() {
		return prop.getProperty("ChromePath");
	}
	
	public String getUserName() {
		return prop.getProperty("UserName");
	}
	
	public String getPassword() {
		return prop.getProperty("Password");
	}

}
