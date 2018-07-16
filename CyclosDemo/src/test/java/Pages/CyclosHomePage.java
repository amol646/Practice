package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import BaseClass.Source_Code;

public class CyclosHomePage extends Source_Code {
	
	By OR_CylosHomePage = By.xpath("//div[@class='pageHeadingText' and contains(text(),'Cyclos 4 Demo')]");
	By OR_Signinbtn = By.xpath("//span[@class='statusMenuText' and contains(text(),'Sign in')]");
	
	
	
		
	public void Mthd_CylosHomePg()
	{
		try 
		{
		driver.findElement(OR_CylosHomePage).isDisplayed();
		
		}
		catch (WebDriverException e)
		{
			e.getMessage();
		}
	}
	
	public CyclosLoginPage Mthd_typeSigninBtn()
	{
		driver.findElement(OR_Signinbtn).click();
		return new CyclosLoginPage();
		
	}

	
}
