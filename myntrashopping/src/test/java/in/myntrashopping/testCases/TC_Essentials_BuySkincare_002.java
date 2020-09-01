package in.myntrashopping.testCases;

import org.testng.annotations.Test;

import in.myntrashopping.pageObjects.EssentialItems;
public class TC_Essentials_BuySkincare_002 extends BaseClass{
	
	@Test
	public void Essentials_BuySkincare()
	{
		driver.get(baseURL);
		EssentialItems essentialitems = new EssentialItems(driver);
		essentialitems.HoverOnEssentials();
		essentialitems.clickOnSkincare();
	}
}
