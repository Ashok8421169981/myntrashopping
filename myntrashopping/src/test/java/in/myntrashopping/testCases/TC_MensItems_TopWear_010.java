package in.myntrashopping.testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import in.myntrashopping.pageObjects.MensItems;

public class TC_MensItems_TopWear_010 extends BaseClass{
	
	@Test
	public void MensItems_TopWear () throws AWTException, InterruptedException
	{
		driver.get(baseURL);
		logger.info("App Url opened...");
		
		MensItems mensItems = new MensItems(driver);
		mensItems.HoverOnMen();
		logger.info("Opening Mens Menu...");
		Thread.sleep(3000);
		
		mensItems.clickOnTopWearLink();
		logger.info("Mens Top Wear Clicked...");
		Thread.sleep(3000);
		
		acceptSecurityPopUp();
		logger.info("Security Popup Closed...");
		Thread.sleep(3000);
		
		mensItems.selectSize();
		Thread.sleep(3000);
		logger.info("Size Drop-Down Opened...");
		mensItems.selectShirtSize();
		logger.info("Shirt's Size Selected...");
		Thread.sleep(3000);
		
		mensItems.selectCategoryAsShirt();
		logger.info("Shirt Filter Applied...");
		Thread.sleep(3000);
		
		mensItems.selectBrands();
		logger.info("Brand Filter Applied...");
		Thread.sleep(3000);
		
		mensItems.selectPriceRange();
		logger.info("Price Range Filter Applied...");
		Thread.sleep(3000);
		
		mensItems.selectColor();
		logger.info("Color Filter Applied...");
		Thread.sleep(3000);
		
		mensItems.selectDiscountRange();
		logger.info("Discount Filter Applied...");
		Thread.sleep(3000);
		
		mensItems.sortBy();
		logger.info("Items Sorted by High to Low Price...");
		Thread.sleep(3000);
		
		mensItems.selectShirtToBuy();
		logger.info("First Item Has been Selected...");
		Thread.sleep(3000);
		
		switchToNewTabs();
		mensItems.selectSizeTOBuy();
		logger.info("Shirt's Size has been Selected...");
		Thread.sleep(3000);
		
		mensItems.ClickAddToBag();
		logger.info("Item has been added into the bag...");
		Thread.sleep(3000);
		
		mensItems.ClickGoTOBag();
		logger.info("Items are there into the bag...");
		Thread.sleep(3000);
		mensItems.ClickPlaceOrder();
		logger.info("Order has been placed...");
	}
}
