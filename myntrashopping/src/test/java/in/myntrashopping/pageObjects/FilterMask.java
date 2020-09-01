package in.myntrashopping.pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterMask {

	WebDriver ldriver;
	public FilterMask (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//label[contains(@class,'common-customRadio gender-label')])[1]")
	//@FindBy(xpath = "//div[@class='vertical-filters-filters']/ul/li//input[@value='men,men women']")
	//@FindBy(xpath ="//div[@class='vertical-filters-filters']//ul[@class='gender-list']/li[2]")
	@CacheLookup
	WebElement MaskforMen;
	
	@FindBy(xpath = "//div[@class='vertical-filters-filters']/ul/li//input[@value='women,men women']")
	@CacheLookup
	WebElement MaskforWomen;
	
	@FindBy(xpath = "//div[@class='vertical-filters-filters']/ul/li//input[@value='boys,boys girls']")
	@CacheLookup
	WebElement MaskforBoys;
	
	@FindBy(xpath = "//div[@class='vertical-filters-filters']/ul/li//input[@value='girls,boys girls']")
	@CacheLookup
	WebElement MaskforGirls;
	
	//@FindBy(xpath= "//ul[@class='price-list']/li[3]")  
	//@FindBy(xpath = "//label[@class='common-customCheckbox vertical-filters-label'])[2]")
	@FindBy(xpath ="//div[@class='vertical-filters-filters']//ul[@class='price-list']/li[2]")
	@CacheLookup
	WebElement PriceRange;
	
	//@FindBy(xpath = "//label[contains(.,'Price: High to Low')]")
	//@FindBy(xpath = "(//label[contains(@class,'sort-label ')])[4]")
	//@FindBy(css = "*[class='sort-label sort-selected']")
	@FindBy(xpath = "(//text()[.='Price: High to Low']/ancestor::label[1])")
	@CacheLookup
	WebElement sortBy;
	
	@FindBy(xpath= "//div[@class='vertical-filters-filters']//li[@class='colour-listItem']//label[@class='common-customCheckbox'][contains(.,'Black')]")
	@CacheLookup
	WebElement Color;

	
	
	public void MaskforMen()
	{
		MaskforMen.click();
	}
	
	public void MaskforWomen()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(MaskforWomen));
		element.click();
		//MaskforWomen.click();
	}
	
	public void MaskforBoys()
	{
		MaskforBoys.click();
	}
	
	public void MaskforGirls()
	{
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions = new Actions (ldriver);
		actions.moveToElement(MaskforGirls);
		actions.build().perform();
		MaskforGirls.click();
	}
	
	public void PriceRange()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(PriceRange));
		element.click();
	}
	
	
	
	public void SortBy()
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(ldriver.findElement(By.xpath("//*[@class='horizontal-filters-sortContainer']")));
		action.build().perform();
		
		ldriver.findElement(By.xpath("//*[@class='sort-list']/li[4]")).click();
		//WebDriverWait wait = new WebDriverWait(ldriver,10);
		//WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='sort-sortBy']//ul[@class='sort-list']/li[4]")));
		//ele.click();
	}
	
	public void MaskColor()
	{
		Color.click();
	}
	
	
}
