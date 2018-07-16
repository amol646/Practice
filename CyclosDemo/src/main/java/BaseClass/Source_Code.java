package BaseClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import Pages.CyclosAccountinfoPage;
import Pages.CyclosHomePage;
import Pages.CyclosLoginPage;
import Pages.CyclosPaymentsPage;
import Pages.CyclosPlaceAdPage;
import Pages.CyclosWelcomePage;
import Utilities.ExcelUtilities;
import Utilities.MyExtentReporter;

public class Source_Code 
{
	
	public static WebDriver driver;
	public CyclosHomePage Obj_homepage ;
	public CyclosLoginPage Obj_LoginPg;
	public CyclosWelcomePage obj_WelcomePg;
	public CyclosAccountinfoPage obj_AccountinfoPg;
	public CyclosPaymentsPage obj_PaymentsPg;
	public CyclosPlaceAdPage Obj_PlaceAdPg;
	public int iWait;
	public static Properties iTestData;
	public static String TCid;
	public String Stepdesc;
	public String Stepstatus;
	
	
	//@BeforeTest
	public void launchapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Test_Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/#home");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		implicitwait(10);
				
	}
	
	public void LoginintoCyclosApplication() throws InterruptedException, IOException
	{
		try
		{		
		
		launchapp();
		Obj_homepage = new CyclosHomePage();		
		Obj_homepage.Mthd_CylosHomePg();
		
		Obj_LoginPg = Obj_homepage.Mthd_typeSigninBtn();	
		Obj_LoginPg.Mthd_CyclosLoginPage();
		Obj_LoginPg.Mthd_typeUserName();
		Obj_LoginPg.Mthd_typePassword();
		
		obj_WelcomePg = Obj_LoginPg.Mthd_typeSubmitBtn();
		obj_WelcomePg.Mthd_CyclosWelcomePage();
		
		MyExtentReporter.executeReport("Step-Login into App", "PASS");
		
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Login into App", "FAIL");
			
		}
		
	}
	
	public void implicitwait(int iWait)
	{
		driver.manage().timeouts().implicitlyWait(iWait,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	@BeforeSuite
	public void testdatafile() throws IOException
	{
		
		MyExtentReporter.initializeReport();
		
		ExcelUtilities.readExcel(System.getProperty("user.dir")+"\\src\\test\\resources\\Utilities\\TestData.xlsx");
		
		FileInputStream file = new FileInputStream(new File("D:\\Test_Automation\\CyclosDemo\\src\\test\\resources\\Utilities\\TestData.Properties"));
		iTestData = new Properties();
		iTestData.load(file);
	}
	
	@AfterSuite
	public void endrun()
	{
		MyExtentReporter.endReport();
	}

	
	
}



