package in.myntrashopping.testCases;
import org.testng.annotations.Test;

import in.myntrashopping.pageObjects.EssentialItems;

public class TC_Essentials_BuyHaircare_003 extends BaseClass{
	
	@Test
	public void Essentials_BuyHaircase()
	{
		driver.get(baseURL);
		EssentialItems essentialitems = new EssentialItems(driver);
		essentialitems.HoverOnEssentials();
		essentialitems.clickOnHaircare();		
	}

}
