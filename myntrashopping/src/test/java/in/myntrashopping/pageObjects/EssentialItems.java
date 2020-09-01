package in.myntrashopping.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EssentialItems {
	
	WebDriver ldriver;
	public EssentialItems (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[text()='Essentials']")
	@CacheLookup
	WebElement txtEssentials;
	
	@FindBy(xpath = "//a[@href='/outdoor-masks'][contains(.,'Masks')]")
	//@FindBy(xpath = "//a[contains(@data-reactid,'611')]")
	@CacheLookup
	WebElement mask;
	
	@FindBy(xpath = "//a[contains(@data-reactid,'613')]")
	@CacheLookup
	WebElement skincare;
	
	@FindBy(xpath = "//a[contains(@data-reactid,'615')]")
	@CacheLookup
	WebElement haircare;
	
	@FindBy(xpath = "//a[contains(@data-reactid,'617')]")
	@CacheLookup
	WebElement bathAndBody;
	
	@FindBy(xpath = "//a[contains(@data-reactid,'619')]")
	@CacheLookup
	WebElement mensGrooming;
	
	@FindBy(xpath = "//a[contains(@data-reactid,'621')]")
	@CacheLookup
	WebElement babyCare;
	
	@FindBy(xpath = "//a[contains(@data-reactid,'623')]")
	@CacheLookup
	WebElement atHomeSalon;
	
	@FindBy(xpath = "//a[contains(@data-reactid,'625')]")
	@CacheLookup
	WebElement hairStyling;
	
	@FindBy(xpath = "//a[contains(@data-reactid,'627')]")
	@CacheLookup
	WebElement appliances;
	
	public void HoverOnEssentials()
	{
		Actions actions = new Actions (ldriver);
		actions.moveToElement(txtEssentials);
		actions.build().perform();
	}
	
	public void clickOnMask()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mask));
		element.click();
	}
	
	@FindBy(xpath = "//div[@class='vertical-filters-filters']/ul/li//label[@class='common-customRadio gender-label undefined']")
	@CacheLookup
	WebElement MaskforMen;
	
	public void clickOnSkincare()
	{
		skincare.click();
	}
	
	public void clickOnHaircare()
	{
		haircare.click();
	}
	
	public void clickOnBathAndBody()
	{
		bathAndBody.click();
	}
	
	public void clickOnMensGrooming()
	{
		mensGrooming.click();
	}
	
	public void clickOnBabyCare()
	{
		babyCare.click();
	}
	
	public void clickOnAtHomeSalon()
	{
		atHomeSalon.click();
	}
	
	public void clickOnHairStyling()
	{
		hairStyling.click();
	}
	
	public void clickOnAppliances()
	{
		appliances.click();
	}
}
