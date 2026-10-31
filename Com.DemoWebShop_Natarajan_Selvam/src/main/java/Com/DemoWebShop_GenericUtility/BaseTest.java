package Com.DemoWebShop_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.DemoWebShop_POM.Home_Page;
import Com.DemoWebShop_POM.Login_Page;
import Com.DemoWebShop_POM.Welcome_Page;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public FileUtility fileutility = new FileUtility();
	public Welcome_Page welcomepage;
	public Login_Page loginpage;
	public Home_Page homepage;
	public WebDriver_Utility webDriverUtility = new WebDriver_Utility();

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite --- DataBase Connection");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test --- Reports Generation");
		spark = new ExtentSparkReporter(FrameWorkConstant.reportsPath);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("DemoWebShop");

	}

	@BeforeClass
	public void beforeclass() throws IOException {
		System.out.println("Before Class --- Launch Browser");

		//String browser = fileutility.readDataFromPropetyFile("browsername");
		//String url = fileutility.readDataFromPropetyFile("url");

		String browser = System.getProperty("broswerName");
		String url = System.getProperty("baseUrl");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Running test on chrome broswer");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Running test on edge broswer");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Running test on firefox broswer");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass the correct browser name: " + url);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sDriver = driver;
		driver.get(url);
	}

	@BeforeMethod
	public void beforemethod() throws IOException {
		System.out.println("Before Method --- Login to App");

		welcomepage = new Welcome_Page(driver);
		welcomepage.getLoginbutton().click();

		loginpage = new Login_Page(driver);
		loginpage.getEnter_the_email_ID().sendKeys(fileutility.readDataFromPropetyFile("username"));
		loginpage.getEnter_the_password().sendKeys(fileutility.readDataFromPropetyFile("password"));
		loginpage.getClick_the_Login_Buton().click();
		homepage = new Home_Page(driver);

	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method --- Logout to App");
		homepage.getClick_on_LogoutButton().click();
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After class --- Close the browser");
		driver.quit();
	}

	@AfterTest
	public void aftertest() {
		System.out.println("After Test --- Report End");
		reports.flush();
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite --- Data");

	}
}
