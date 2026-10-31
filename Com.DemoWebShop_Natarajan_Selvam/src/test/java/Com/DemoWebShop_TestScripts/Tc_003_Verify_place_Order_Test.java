package Com.DemoWebShop_TestScripts;
import java.io.IOException;

import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.DemoWebShop_POM.Book_page;
import Com.DemoWebShop_POM.Checkout_Page;
import Com.DemoWebShop_POM.Shoppingcart_Page;

public class Tc_003_Verify_place_Order_Test extends BaseTest {

	@Test
	public void placeoder() throws IOException, InterruptedException {
		System.out.println("Place the Order");

		homepage.getClick_On_Search().sendKeys(fileutility.readDataFromPropetyFile("productName"));
		homepage.getClick_On_Search_Button().click();

		Book_page bookPage = new Book_page(driver);
		webDriverUtility.javascriptsClick(driver, bookPage.getAddtocartbutton());

		Thread.sleep(2000);
		homepage.getShoppingcardlink().click();

		Shoppingcart_Page cartPage = new Shoppingcart_Page(driver);
		cartPage.getTermsadncondition().click();
		cartPage.getCheckoutbutton().click();

		Checkout_Page checkoutpage = new Checkout_Page(driver);
		checkoutpage.getContinuebutton().get(0).click();
		checkoutpage.getContinuebutton().get(1).click();
		checkoutpage.getContinuebutton().get(2).click();
		checkoutpage.getContinuebutton().get(3).click();
		checkoutpage.getContinuebutton().get(4).click();

		checkoutpage.getConfirmbutton().click();
		
		
		Thread.sleep(2000);
		webDriverUtility.webpageScreenshot(driver);

	}

}
