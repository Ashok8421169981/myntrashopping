package in.myntrashopping.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() {
		File src = new File ("./Configuration/config.properties");   
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
			}
		
		catch(Exception e)
		{
		System.out.println("Exception Is: "+e.getMessage());
		}
		
	}
	
	public String getApplicationURL()
	{
		String AppURL = prop.getProperty("baseURL");
		return AppURL;
	}
	
	public String getTestURL()
	{
		String TestURL = prop.getProperty("TestURL");
		return TestURL;
	}
	
	public String getchromePath()
	{
		String chromeDriverPath = prop.getProperty("chromeDriverPath");
		return chromeDriverPath;
	}
	
	public String getFireFoxPath()
	{
		String FireFoxPath = prop.getProperty("FireFoxPath");
		return FireFoxPath;
	}

}
