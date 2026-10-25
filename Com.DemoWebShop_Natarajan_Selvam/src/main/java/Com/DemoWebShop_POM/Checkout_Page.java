package Com.DemoWebShop_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page {
		
		public Checkout_Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath  = "//input[@value='Continue']")
		private List<WebElement> continuebutton;
		

		@FindBy(xpath  = "//input[@value='Confirm']")
		private WebElement confirmbutton;


		public List<WebElement> getContinuebutton() {
			return continuebutton;
		}


		public WebElement getConfirmbutton() {
			return confirmbutton;
		}
		
		

}
