package in.myntrashopping.pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

public class MensItems {
	
	WebDriver ldriver;
	public MensItems (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='Men']")
	@CacheLookup
	WebElement txtMen;
	
	@FindBy (xpath = "//a[text()='Topwear']")
	@CacheLookup
	WebElement MensTopWears;
	
	@FindBy (xpath = "//*[@class='categories-list']/li[1]")
	@CacheLookup
	WebElement categoryAsShirt;
	
	@FindBy (xpath = "//*[@class='brand-list']/li[1]")
	@CacheLookup
	WebElement clickBrndLink;
	
	@FindBy (xpath = "//*[@class='price-list']/li[1]")
	@CacheLookup
	WebElement clickOnPriceList;
	
	@FindBy (xpath = "//div[@class='vertical-filters-filters']//li[@class='colour-listItem']//label[@class='common-customCheckbox'][contains(.,'Black')]")
	@CacheLookup
	WebElement clickonColorList;
	
	@FindBy (xpath = "//*[@class='discount-list']/li[3]")
	@CacheLookup
	WebElement clickonDiscountList;
	
	@FindBy (xpath = "//*[@class='atsa-base']//ul[@class='atsa-values']//label[@class='common-customCheckbox'][contains(.,'40')]")
	@CacheLookup
	WebElement clickOnSize;
	
	@FindBy(xpath = "(//h4[contains(@class,'atsa-title')])[2]")
	@CacheLookup
	WebElement clickonTextSize;
	
	@FindBy (xpath = "//*[@class='horizontal-filters-sortContainer']")
	@CacheLookup
	WebElement textSortBy;
	
	@FindBy (xpath = "//*[@class='sort-list']/li[4]")
	@CacheLookup
	WebElement sortHightoLow;
	
	@FindBy (xpath = "(//img[@class='img-responsive'])[1]")
	@CacheLookup
	WebElement clicktoBuy;
	
	@FindBy (xpath = "//p[@class='size-buttons-unified-size'][contains(.,'40')]")
	@CacheLookup
	WebElement sizeText;
	
	@FindBy (xpath = "(//div[contains(.,'ADD TO BAG')])[9]")
	@CacheLookup
	WebElement addToBagButton;
	
	@FindBy (xpath = "//span[contains(.,'GO TO BAG')]")
	@CacheLookup
	WebElement goToBagButton;
	
	@FindBy (xpath = "(//div[contains(.,'Place Order')])[11]")
	@CacheLookup
	WebElement placeOrderButton;

	public void HoverOnMen()
	{
		Actions actions = new Actions (ldriver);
		actions.moveToElement(txtMen);
		actions.build().perform();
	}
	
	public void clickOnTopWearLink()
	{
		MensTopWears.click();
	}
	
	public void selectCategoryAsShirt()
	{
		categoryAsShirt.click();
	}
	
	public void selectBrands()
	{
		clickBrndLink.click();
	}
	
	public void selectPriceRange()
	{
		clickOnPriceList.click();
	}
	
	public void selectColor()
	{
		clickonColorList.click();
	}
	
	public void selectDiscountRange()
	{
		clickonDiscountList.click();
	}
	
	public void selectSize()
	{
		clickonTextSize.click();
	}
	
	public void selectShirtSize()
	{
		clickOnSize.click();
	}
	
	public void selectSizeTOBuy()
	{
		sizeText.click();
	}
	
	public void sortBy()
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(textSortBy);
		action.build().perform();		
		sortHightoLow.click();
	}
	
	public void selectShirtToBuy()
	{
		clicktoBuy.click();
	}
	
	public void ClickAddToBag()
	{
		addToBagButton.click();
	}
	
	public void ClickGoTOBag()
	{
		goToBagButton.click();
	}
	
	public void ClickPlaceOrder()
	{
		placeOrderButton.click();
	}
	
}
