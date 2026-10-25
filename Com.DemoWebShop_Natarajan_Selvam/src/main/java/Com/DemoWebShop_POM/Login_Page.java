package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//input[@id='Email']")
	private WebElement enter_the_email_ID;
	
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement enter_the_password;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Click_the_Login_Buton;


	public WebElement getEnter_the_email_ID() {
		return enter_the_email_ID;
	}

	public WebElement getEnter_the_password() {
		return enter_the_password;
	}

	public WebElement getClick_the_Login_Buton() {
		return Click_the_Login_Buton;
	}
	
}
