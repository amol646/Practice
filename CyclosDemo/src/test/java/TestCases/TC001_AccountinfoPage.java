package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.Source_Code;
import Utilities.MyExtentReporter;

public class TC001_AccountinfoPage extends Source_Code
{
	
	
	@Test
	public void TC001_verifyaccountinfopage() throws InterruptedException, IOException
		
	{
		MyExtentReporter.initializeTestcase("TC001_verifyaccountinfopage");  // initiating extent report at test case level 
		
		LoginintoCyclosApplication();
		
		obj_AccountinfoPg = obj_WelcomePg.Mthd_ClickAccountInfoTab();
		
		obj_AccountinfoPg.Mthd_CyclosAccountinfoPg();
		
		
	}
	
	
}
