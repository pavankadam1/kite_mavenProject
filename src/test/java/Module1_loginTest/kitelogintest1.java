package Module1_loginTest;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Module1_login.KiteLogin1Page_1;
import Module1_login.KitelHomePage_1;
import Module1_login.Kitelogin2Page_1;
import Module1_login.UtilityClass_2;

public class kitelogintest1 extends baseClass1

{
	// ddeclare globally
	// WebDriver driver;
	public KiteLogin1Page_1 login1;
	public Kitelogin2Page_1 login2;
	public KitelHomePage_1 home;
	public Sheet sh;
	public int TCID;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		Reporter.log("-open browser-", true);

		initializebrowser1(); // both methods are non statics
		// parameterization by using set steaminput file

		FileInputStream file = new FileInputStream("C:\\software files\\selenium_exel\\Book2.xlsx");

		sh = WorkbookFactory.create(file).getSheet("sheet2");

		// a = 10; // initialize locally
		// create object of pom classes
		login1 = new KiteLogin1Page_1(driver);
		login2 = new Kitelogin2Page_1(driver);
		home = new KitelHomePage_1(driver);
	}

	// @BeforeMethod
	@Test(priority = -2)
	public void loginTOKite() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("logging to app", true);

		// find element to login --- we cant acces local object ofopen browser decliaes
		// it as gloablly
		// System.out.println(a);
		login1.inpKiteLogin1Page_1Username(UtilityClass_2.GetPFdata("UN"));
		login1.inpKiteLogin1Page_1password(UtilityClass_2.GetPFdata("PWD"));
		login1.clickKiteLogin1Page_1loginbtn();

		Thread.sleep(2000);
		login2.inpKiteLogin1Page_1pin(UtilityClass_2.GetPFdata("PIN"));
		login2.clickKiteLogin1Page_1contnbtn();

	}

	@Test
	public void verifyUserId() throws EncryptedDocumentException, IOException {
		Reporter.log("verifying UserID", true);

		String actUserID = home.getKiteHomePageUserID();
		String expUserID = UtilityClass_2.logindata(0, 3);

		Assert.assertEquals(actUserID, expUserID, "Failed:Verify is not matched");

	}

	@Test(dependsOnMethods = "verifyUserId")
	public void verifyusername() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("verifyusername", true);
		Thread.sleep(5000);
		String actusename = home.getKiteHomeageUsername();
		System.out.println(actusename);
		String expuid = UtilityClass_2.logindata(0, 4);
		Assert.assertEquals(actusename, expuid, "failed if notmatched usernme");

		UtilityClass_2.capturedscreeshot1(driver, TCID);

	}

//	@AfterMethod
//	public void logoutFromApp() 
//	{
//		Reporter.log("-logout from app-",true);
//		
//		
//	}
//	

//	@AfterClass
//	public void closeBrowser()
//	{
//
//		Reporter.log("-close browser-",true);
//		driver.close();
//
//
//	}

}
