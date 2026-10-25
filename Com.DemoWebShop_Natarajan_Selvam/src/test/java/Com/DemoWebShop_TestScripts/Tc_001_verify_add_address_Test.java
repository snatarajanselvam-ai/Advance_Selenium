package Com.DemoWebShop_TestScripts;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.DemoWebShop_POM.AddNewAddress_Page;
import Com.DemoWebShop_POM.Addresses_Page;

public class Tc_001_verify_add_address_Test extends BaseTest {

	@Test
	public void addaddress() throws IOException, EncryptedDocumentException, InterruptedException {
		System.out.println("Add Address Test Script");

		webDriverUtility.javascriptsscrollTillElement(driver, homepage.getClick_On_Addreeses());
		homepage.getClick_On_Addreeses().click();

		Addresses_Page addressPage = new Addresses_Page(driver);
		addressPage.getAddNewAddressBtn().click();

		AddNewAddress_Page newAddresPage = new AddNewAddress_Page(driver);
		newAddresPage.getFirstnametextfeild().sendKeys(fileutility.readDataFromExcelFile("testscriptdata", 1, 0));
		newAddresPage.getLastnametextfeild().sendKeys(fileutility.readDataFromExcelFile("testscriptdata", 1, 1));
		newAddresPage.getEmailtextfeild().sendKeys(fileutility.readDataFromExcelFile("testscriptdata", 1, 2));

		webDriverUtility.selectByVisibleText(newAddresPage.getCountrydropdown(),
				fileutility.readDataFromExcelFile("testscriptdata", 1, 3));

		newAddresPage.getCitytextfeild().sendKeys(fileutility.readDataFromExcelFile("testscriptdata", 1, 4));
		newAddresPage.getAddress1textfeild().sendKeys(fileutility.readDataFromExcelFile("testscriptdata", 1, 5));
		newAddresPage.getZipcodetextfeild().sendKeys(fileutility.readDataFromExcelFile("testscriptdata", 1, 6));
		newAddresPage.getPhonenumbertextfeild().sendKeys(fileutility.readDataFromExcelFile("testscriptdata", 1, 7));
		newAddresPage.getSavebutton().click();
		
		Thread.sleep(2000);
		webDriverUtility.webpageScreenshot(driver);
		
		
		
	}

}
