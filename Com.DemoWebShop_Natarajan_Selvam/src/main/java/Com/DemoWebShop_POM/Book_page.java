package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_page {
	
	public Book_page (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addtocartbutton;

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
	

}
