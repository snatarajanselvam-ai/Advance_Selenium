
package Com.DemoWebShop_GenericUtility;

public interface FrameWorkConstant {

	JavaUtility javaUtility = new JavaUtility();

	static String propertyfilePath = "./src/test/resources/TestData/commonData.properties";

	static String excelfilePath = "./src/test/resources/TestData/testscriptdata.xlsx";

	static String screenshotpath = "./Screenshots/" + javaUtility.localDateString() + ".png";

	static String reportsPath = "./Reports/" + javaUtility.localDateString() + ".html";
}
