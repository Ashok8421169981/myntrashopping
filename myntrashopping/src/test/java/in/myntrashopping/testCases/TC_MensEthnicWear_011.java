package in.myntrashopping.testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;

import in.myntrashopping.pageObjects.MensEthnicWear;

public class TC_MensEthnicWear_011 extends BaseClass{
	
	@Test
	public void EthnicWearForMen () throws InterruptedException, AWTException
	{
		driver.get(baseURL);
		logger.info("App Url opened...");
		Thread.sleep(3000);
		
		MensEthnicWear mensEthnicWear = new MensEthnicWear(driver);
		mensEthnicWear.HoverOnMen();
		logger.info("Opening Mens Menu...");
		Thread.sleep(3000);
		
		mensEthnicWear.SelectIndianAndFestiveWear();
		logger.info("Indian And Festive Wear  Selected...");
		Thread.sleep(3000);
		
		acceptSecurityPopUp();
		logger.info("Security Popup Closed...");
		Thread.sleep(3000);
		
		mensEthnicWear.selectSize();
		logger.info("Size Drop-Down Opened...");
		Thread.sleep(3000);
		
		mensEthnicWear.SelectSizeCheckBox();
		logger.info("Size check-box selected... ");
		Thread.sleep(3000);
		
		mensEthnicWear.SelectKurtaSets();
		logger.info("Kurta Sets selected...");
		Thread.sleep(3000);
		
		mensEthnicWear.EnterBrandName();
		logger.info("Brand Name Entered...");
		Thread.sleep(3000);
		
		mensEthnicWear.SelectColor();
		logger.info("Color Selected...");
		Thread.sleep(3000);
		
		mensEthnicWear.SelectPrice();
		logger.info("Price Selected...");
		Thread.sleep(3000);
		
		mensEthnicWear.sortBy();
		logger.info("Item Sorted High to Low...");
		Thread.sleep(3000);
		
		mensEthnicWear.selectKurtaToBuy();
		logger.info("Kurta Selected to Buy...");
		Thread.sleep(3000);
		
		switchToNewTabs();
		mensEthnicWear.selectSizeTOBuy();
		logger.info("Size Selected...");
		Thread.sleep(3000);
		
		mensEthnicWear.ClickAddToBag();
		logger.info("Item Added to the Bag...");
		Thread.sleep(3000);
		
		mensEthnicWear.ClickGoTOBag();
		logger.info("Item is there into the bag...");
		Thread.sleep(3000);
		
		mensEthnicWear.ClickPlaceOrder();
		logger.info("Order has been placed...");
		Thread.sleep(3000);
		acceptSecurityPopUp();
		
	}

}
