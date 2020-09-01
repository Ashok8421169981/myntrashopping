package in.myntrashopping.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import in.myntrashopping.pageObjects.EssentialItems;
import in.myntrashopping.pageObjects.FilterMask;

public class TC_Essentials_BuyMask_001 extends BaseClass{
	
	@Test
	public void Essentials_BuyMask() throws InterruptedException, AWTException
	{
		driver.get(baseURL);
		logger.info("Url is opened..");
		EssentialItems essentialitems = new EssentialItems(driver);
		FilterMask filterMask = new FilterMask(driver);
		essentialitems.HoverOnEssentials();
		logger.info("Opening Essentials Menu.. ");
		essentialitems.clickOnMask();
		logger.info("Mask is clicked..");
		
		acceptSecurityPopUp();		
		Thread.sleep(3000);
		filterMask.MaskforMen();
		logger.info("MaskforMen Slected");	
		Thread.sleep(3000);
		
		filterMask.MaskColor();
		logger.info("MaskColor Slected");
		Thread.sleep(3000);
		
		filterMask.PriceRange();
		logger.info("PriceRange Slected");
		Thread.sleep(3000);
		filterMask.SortBy();
	}

}
