package in.myntrashopping.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import in.myntrashopping.utilities.ReadConfig;

	public class Check_Test extends BaseClass{
		@Test
		public void TestCheck()
		{
		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='vertical-filters-filters']/ul/li//input[@value='men,men women']")).click();
		priceRange();
		}
		
		public static void priceRange()
		{
			List<WebElement>allPrice = driver.findElements(By.xpath("//div[@class='vertical-filters-filters']//ul[@class='price-list']/li"));
			System.out.println(allPrice); 
			System.out.println(allPrice.get(1));
			allPrice.get(0).click();
		}
		
	}

