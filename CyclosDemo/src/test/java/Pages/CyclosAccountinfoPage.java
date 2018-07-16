package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

import BaseClass.Source_Code;
//import Utilities.ExtentReport;
import Utilities.MyExtentReporter;

public class CyclosAccountinfoPage extends Source_Code
{
	By OR_CyclosAccountinfoPg = By.xpath("//div[@class='pageHeadingText' and contains(text(),'Member account')]");
	
	public void Mthd_CyclosAccountinfoPg() throws IOException
	{
		try
		{
			driver.findElement(OR_CyclosAccountinfoPg).isDisplayed();
			MyExtentReporter.executeReport("Step-Mthd_CyclosAccountinfoPg", "PASS");
		}
		catch (WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_CyclosAccountinfoPg", "FAIL");
		}
	}
	
	
}
