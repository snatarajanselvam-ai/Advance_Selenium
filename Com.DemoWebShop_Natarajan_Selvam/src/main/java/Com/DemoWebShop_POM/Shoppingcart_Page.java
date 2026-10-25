package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcart_Page {
	
	public Shoppingcart_Page (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id  = "termsofservice")
	private WebElement termsadncondition;
	
	@FindBy(id = "checkout")
	private WebElement checkoutbutton;

	public WebElement getTermsadncondition() {
		return termsadncondition;
	}

	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}
	
	
}