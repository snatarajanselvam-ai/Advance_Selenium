package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_Page {
	
	public AddNewAddress_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addnewbutton;
	
	@FindBy(xpath = "//input[@id='Address_FirstName']")
	private WebElement firstnametextfeild;
	
	@FindBy(xpath = "//input[@id='Address_LastName']")
	private WebElement lastnametextfeild;
	
	@FindBy(xpath = "//input[@id='Address_Email']")
	private WebElement emailtextfeild;
	
	@FindBy(xpath = "//select[@id='Address_CountryId']")
	private WebElement countrydropdown;
	
	@FindBy(xpath = "//input[@id='Address_City']")
	private WebElement citytextfeild;
	
	@FindBy(xpath = "//input[@id='Address_Address1']")
	private WebElement address1textfeild;
	
	@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
	private WebElement zipcodetextfeild;
	
	@FindBy(xpath = "//input[@id='Address_PhoneNumber']")
	private WebElement phonenumbertextfeild;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement savebutton;

	public WebElement getAddnewbutton() {
		return addnewbutton;
	}

	public WebElement getFirstnametextfeild() {
		return firstnametextfeild;
	}

	public WebElement getLastnametextfeild() {
		return lastnametextfeild;
	}

	public WebElement getEmailtextfeild() {
		return emailtextfeild;
	}

	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getCitytextfeild() {
		return citytextfeild;
	}

	public WebElement getAddress1textfeild() {
		return address1textfeild;
	}

	public WebElement getZipcodetextfeild() {
		return zipcodetextfeild;
	}

	public WebElement getPhonenumbertextfeild() {
		return phonenumbertextfeild;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	
	
}
