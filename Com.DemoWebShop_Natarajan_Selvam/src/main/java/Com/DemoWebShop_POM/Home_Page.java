package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =  "//a[@class='ico-logout']")
	private WebElement Click_on_LogoutButton;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement click_On_Search;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement Click_On_Search_Button;
	
	@FindBy(xpath = "//a[normalize-space()='Addresses']")
	private WebElement Click_On_Addreeses;
	
	@FindBy(xpath = "//span[normalize-space()='Shopping cart']")
	private WebElement shoppingcardlink;
	

	public WebElement getShoppingcardlink() {
		return shoppingcardlink;
	}

	public void setShoppingcardlink(WebElement shoppingcardlink) {
		this.shoppingcardlink = shoppingcardlink;
	}

	public WebElement getClick_on_LogoutButton() {
		return Click_on_LogoutButton;
	}

	public WebElement getClick_On_Search() {
		return click_On_Search;
	}

	public WebElement getClick_On_Search_Button() {
		return Click_On_Search_Button;
	}

	public WebElement getClick_On_Addreeses() {
		return Click_On_Addreeses;
	}
	
	
	

}
