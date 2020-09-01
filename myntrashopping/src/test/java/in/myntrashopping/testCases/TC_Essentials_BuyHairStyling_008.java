package in.myntrashopping.testCases;

import org.testng.annotations.Test;

import in.myntrashopping.pageObjects.EssentialItems;

public class TC_Essentials_BuyHairStyling_008 extends BaseClass{
	
	@Test
	public void Essentials_BuyHairStyling()
	{
		driver.get(baseURL);
		EssentialItems essentialItems = new EssentialItems(driver);
		essentialItems.HoverOnEssentials();
		essentialItems.clickOnHairStyling();
	}

}
