package Com.DemoWebShop_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresses_Page {

	public Addresses_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement loginbutton;

	@FindBy(xpath = "//input[@value='Delete']")
	private List<WebElement> deletebutton;

	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewAddressBtn;

	public WebElement getAddNewAddressBtn() {
		return addNewAddressBtn;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public List<WebElement> getDeletebutton() {
		return deletebutton;
	}
}
