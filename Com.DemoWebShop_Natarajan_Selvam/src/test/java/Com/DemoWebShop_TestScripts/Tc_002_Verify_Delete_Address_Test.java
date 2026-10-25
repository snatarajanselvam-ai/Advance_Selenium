package Com.DemoWebShop_TestScripts;
import java.io.IOException;

import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.DemoWebShop_POM.Addresses_Page;

public class Tc_002_Verify_Delete_Address_Test extends BaseTest {

	@Test
	public void deleaddress() throws InterruptedException, IOException {

		System.out.println("Delete the address in the Test Scripts");
		webDriverUtility.javascriptsscrollTillElement(driver, homepage.getClick_On_Addreeses());
		homepage.getClick_On_Addreeses().click();

		Addresses_Page addressPage = new Addresses_Page(driver);
		addressPage.getDeletebutton().get(0).click();

		webDriverUtility.javaScriptPopupAccept(driver);

		Thread.sleep(2000);
		driver.navigate().refresh();

		Thread.sleep(2000);
		webDriverUtility.webpageScreenshot(driver);
	}
}
