package in.myntrashopping.testCases;

import org.testng.annotations.Test;

import in.myntrashopping.pageObjects.EssentialItems;

public class TC_Essentials_BuyMensGrooming_005 extends BaseClass{
	
	@Test
	public void Essentials_BuyMensGrooming()
	{
		driver.get(baseURL);
		EssentialItems essentialsitems = new EssentialItems(driver);
		essentialsitems.HoverOnEssentials();
		essentialsitems.clickOnMensGrooming();
	}

}
