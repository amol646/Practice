package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

import BaseClass.Source_Code;
import Utilities.MyExtentReporter;

public class CyclosWelcomePage extends Source_Code

{
	
	By OR_CycloswelcomePg = By.xpath("//div[@class='pageSectionHeading' and contains(text(),'Welcome to the')]");
	By OR_AccountinfoTab = By.xpath("//div[@class='dashboardActionLabel' and contains(text(),'Account info')]");
	By OR_PayUserTab = By.xpath("//div[@class='dashboardActionLabel' and contains(text(),'Pay user')]");
	By OR_PlaceAd = By.xpath("//div[@class='dashboardActionLabel' and contains(text(),'Place ad')]");
	
	public void Mthd_CyclosWelcomePage()
	{
		try
		{
		driver.findElement(OR_CycloswelcomePg).isDisplayed();
		}
		catch(WebDriverException e)
		{
			e.getMessage();
		}
		
	}

	public CyclosAccountinfoPage Mthd_ClickAccountInfoTab() throws IOException 
	{
		try
		{
		driver.findElement(OR_AccountinfoTab).click();
		MyExtentReporter.executeReport("Step-Mthd_ClickAccountInfoTab", "PASS");
		
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_ClickAccountInfoTab", "FAIL");
		}
		return new CyclosAccountinfoPage();
	}
	
	public CyclosPaymentsPage Mthd_ClickPaymentsUserTab() throws IOException
	{
		try
		{
		driver.findElement(OR_PayUserTab).click();
		MyExtentReporter.executeReport("Step-Mthd_ClickPaymentsUserTab", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_ClickPaymentsUserTab", "FAIL");
		}
		return new CyclosPaymentsPage();
	}
	
	public CyclosPlaceAdPage Mthd_ClickPlaceAd() throws IOException
	{
		try
		{
			driver.findElement(OR_PlaceAd).click();
			MyExtentReporter.executeReport("Step-Mthd_ClickPlaceAd", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_ClickPlaceAd", "FAIL");
		}
		
		return new CyclosPlaceAdPage();
		
	}
	
	
	
	
	
} // End of Class
