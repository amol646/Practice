/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

import BaseClass.Source_Code;
import Utilities.ExcelUtilities;

/**
 * @author TOOLS-LAB-01
 *
 */
public class CyclosLoginPage extends Source_Code 

{

	By OR_CyclosLoginPage = By.xpath("//div[@class='pageHeadingText' and contains(text(),'System login')]");
	By OR_Username = By.name("principal");
	By OR_Password = By.name("password");
	By OR_Submitbtn = By.xpath("//div[text()='Sign in']");
	
	
	
	public void Mthd_CyclosLoginPage ()
	{
		try
		{
		driver.findElement(OR_CyclosLoginPage).isDisplayed();
		}
		catch (WebDriverException e)
		{
			e.getMessage();
		}
	}
	
	
	public void Mthd_typeUserName()
	{
		//driver.findElement(OR_Username).sendKeys("demo");
		driver.findElement(OR_Username).sendKeys(iTestData.getProperty("UserName"));
		
	}
	
	public void Mthd_typePassword()
	{
		driver.findElement(OR_Password).sendKeys(iTestData.getProperty("Password"));
		
	}
	
	public CyclosWelcomePage Mthd_typeSubmitBtn()
	{
		driver.findElement(OR_Submitbtn).click();
		return new CyclosWelcomePage() ;
		
		
	}
	
	
}
