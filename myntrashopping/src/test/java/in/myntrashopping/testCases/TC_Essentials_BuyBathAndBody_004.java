package in.myntrashopping.testCases;

import org.testng.annotations.Test;

import in.myntrashopping.pageObjects.EssentialItems;

public class TC_Essentials_BuyBathAndBody_004 extends BaseClass{
	
	@Test
	public void Essentials_BuyBathAndBody()
	{
		driver.get(baseURL);
		EssentialItems essentialitems = new EssentialItems(driver);
		essentialitems.HoverOnEssentials();
		essentialitems.clickOnBathAndBody();
	}

}
