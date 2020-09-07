package in.myntrashopping.testCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.j2objc.annotations.Property;

import in.myntrashopping.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	public String baseURL = readConfig.getApplicationURL();
	
	// only for testing porpose for respective page elements 
	public String TestURL = readConfig.getTestURL();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",readConfig.getchromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		logger = Logger.getLogger("myntrashopping");
		PropertyConfigurator.configure("Log4j.properties");		
		
	}
	
    @AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
    	//driver.quit();
	}
    
    	public void acceptSecurityPopUp() throws AWTException
  		{
  			Robot robot = new Robot();
  			robot.delay(3000);
  			robot.keyPress(KeyEvent.VK_TAB);
  			robot.keyPress(KeyEvent.VK_ENTER);
  		}
    	
    	public void switchToNewTabs()
    	{
    		ArrayList<String> Newtabs = new ArrayList<String> (driver.getWindowHandles());
    	    driver.switchTo().window(Newtabs.get(1));
    	}
  		
}
