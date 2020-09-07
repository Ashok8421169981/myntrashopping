package in.myntrashopping.pageObjects;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensEthnicWear {
	
	WebDriver ldriver;
	public MensEthnicWear (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[text()='Men']")
	@CacheLookup
	WebElement txtMen;
	
	@FindBy (xpath = "//a[text()='Indian & Festive Wear']")
	@CacheLookup
	WebElement clickIndianAndFestiveWear;
	
	@FindBy(xpath = "//h4[@class='atsa-title'][contains(.,'Size')]")
	@CacheLookup
	WebElement clickonTextSize;
	
	@FindBy (xpath = "(//div[contains(@class,'common-checkboxIndicator')])[31]")
	@CacheLookup
	WebElement checkBoxSizeLong;
	
	@FindBy (xpath = "//*[@class='categories-list']/li[1]")
	@CacheLookup
	WebElement categoryAsKurtaSets;
	
	@FindBy(xpath = "(//span[contains(@class,'myntraweb-sprite filter-search-iconSearch sprites-search')])[1]")
	@CacheLookup
	WebElement searchForBrandIcon;
	
	@FindBy (xpath = "//input[@placeholder='Search for Brand']")
	@CacheLookup
	WebElement enterBrandName;
	
	@FindBy (xpath = "//label[contains(.,'Manyavar(101)')]")
	@CacheLookup
	WebElement selectBrand;
	
	@FindBy (xpath = "//div[@class='vertical-filters-filters']//li[@class='colour-listItem']//label[@class='common-customCheckbox'][contains(.,'Beige')]")
	@CacheLookup
	WebElement selectColor;
	
	@FindBy (xpath = "//div[@class='vertical-filters-filters']//ul[@class='price-list']/li[1]")
	@CacheLookup
	WebElement selectPrice;
	
	@FindBy (xpath = "//*[@class='horizontal-filters-sortContainer']")
	@CacheLookup
	WebElement textSortBy;
	
	@FindBy (xpath = "//*[@class='sort-list']/li[4]")
	@CacheLookup
	WebElement sortHightoLow;
	
	@FindBy (xpath = "(//img[@class='img-responsive'])[1]")
	@CacheLookup
	WebElement clicktoBuy;
	
	@FindBy (xpath = "(//p[@class='size-buttons-unified-size'][contains(.,'L')])[1]")
	@CacheLookup
	WebElement selectSizeL;
	
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
	
	public void SelectIndianAndFestiveWear()
	{
		clickIndianAndFestiveWear.click();
	}
	
	public void selectSize()
	{
		clickonTextSize.click();
	}
	
	public void SelectSizeCheckBox()
	{
		checkBoxSizeLong.click();
	}
	
	public void SelectKurtaSets()
	{
		categoryAsKurtaSets.click();
	}
	
	public void EnterBrandName()
	{
		searchForBrandIcon.click();
		enterBrandName.sendKeys("Manyavar");
		ldriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		selectBrand.click();
	}
	
	public void SelectColor()
	{
		selectColor.click();
	}
	
	public void SelectPrice()
	{
		selectPrice.click();
	}
	
	public void sortBy()
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(textSortBy);
		action.build().perform();		
		sortHightoLow.click();
	}
	
	public void selectKurtaToBuy()
	{
		clicktoBuy.click();
	}
	
	public void selectSizeTOBuy()
	{
		selectSizeL.click();
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
