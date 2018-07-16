package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

import BaseClass.Source_Code;
import Utilities.MyExtentReporter;

public class CyclosPlaceAdPage extends Source_Code
{

	By VerifyPlaceAdPg = By.xpath("//div[@class='pageHeadingText' and contains(text(),'Create new advertisement')]");
	By Obj_AdTitle = By.xpath("//input[@class='inputField large' and @type='text']");
	By Obj_AdCategory = By.xpath("//div[@class='selectionLabel' and contains(text(),'Please, select an option')]");
	By Obj_AdPrice = By.xpath("//input[@class='inputField large rightAligned']");
	By Obj_AdIsHidden = By.xpath("(//img[@src='https://demo.cyclos.org/cyclos.gwt/clear.cache.gif'])[6]");
	By Obj_AdDescription = By.xpath("//iframe[@class='richTextField']");
	By Obj_AdTypeDemand = By.xpath("//span[@class='checkableLabel' and contains(text(),'Demand')]");
	By Obj_AdSaveBtn = By.xpath("//div[@class='actionButtonText' and contains(text(),'Save')]");
	
	
	public void Mthd_VerifyPlaceAdPg() throws IOException
	{
		try
		{
		driver.findElement(VerifyPlaceAdPg).isDisplayed();
		MyExtentReporter.executeReport("Step-Mthd_VerifyPlaceAdPg", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_VerifyPlaceAdPg", "FAIL");
		}
	}
	
	public void Mthd_EnterAdTitle() throws IOException
	{
		try
		{
		driver.findElement(Obj_AdTitle).sendKeys(iTestData.getProperty("AdTitle"));
		MyExtentReporter.executeReport("Step-Mthd_EnterAdTitle", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_EnterAdTitle", "FAIL");
		}
	}
	
	
	public void Mthd_EnterAdCategory() throws IOException
	{
		try
		{
		driver.findElement(Obj_AdCategory).click();
		implicitwait(3);
		driver.findElement(By.xpath("//span[@class='gwt-InlineLabel' and contains(text(),'Activities')]")).click();
		MyExtentReporter.executeReport("Step-Mthd_EnterAdCategory", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_EnterAdCategory", "FAIL");
		}
	}
	
	public void Mthd_EnterAdPrice() throws IOException
	{
		try
		{
		driver.findElement(Obj_AdPrice).sendKeys(iTestData.getProperty("AdPrice"));
		MyExtentReporter.executeReport("Step-Mthd_EnterAdPrice", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_EnterAdPrice", "FAIL");
		}
	}
	
	public void Mthd_AdIsHidden() throws IOException
	{
		try
		{
		driver.findElement(Obj_AdIsHidden).click();
		MyExtentReporter.executeReport("Step-Mthd_AdIsHidden", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_AdIsHidden", "FAIL");
		}
	}
	
	public void Mthd_EnterAdDescription() throws IOException
	{
		try
		{
		driver.findElement(Obj_AdDescription).sendKeys(iTestData.getProperty("AdDescription"));
		MyExtentReporter.executeReport("Step-Mthd_EnterAdDescription", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_EnterAdDescription", "FAIL");
		}
	}
	
	public void Mthd_EnterAdTypeasDemand() throws IOException
	{
		try
		{
			driver.findElement(Obj_AdTypeDemand).click();
			MyExtentReporter.executeReport("Step-Mthd_EnterAdTypeasDemand", "PASS");
			
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_EnterAdTypeasDemand", "FAIL");
		}
	}
	
	public void Mthd_ClickonSaveBtn() throws IOException
	{
		try
		{
		driver.findElement(Obj_AdSaveBtn).click();
		MyExtentReporter.executeReport("Step-Mthd_ClickonSaveBtn", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_ClickonSaveBtn", "FAIL");
		}
	}
	
	
} // End of Class
