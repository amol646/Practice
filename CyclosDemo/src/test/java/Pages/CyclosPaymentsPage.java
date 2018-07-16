package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Source_Code;
import Utilities.MyExtentReporter;

public class CyclosPaymentsPage extends Source_Code
{
	By Obj_PaymentPage = By.xpath("//div[@class='pageHeadingText' and contains(text(),'Payment to user')]");
	By Obj_PaymentUser = By.xpath("//input[@class='inputField large' and @type='text']");
	By Obj_PaymentAmt = By.xpath("//input[@class='inputField large rightAligned' and @type='text']");
	By Obj_PaymentDesc = By.xpath("//textarea[@class='inputField full' and @name='description']");
	By Obj_PaymentSubmitBtn = By.xpath("//button[@class='actionButton' and @type='button']");
	By Obj_PaymentConfirmBtn = By.xpath("//div[@class='actionButtonText' and contains(text(),'Confirm')]");
	
	
	
	public void Mthd_VerifyPaymentsPg() throws Exception
	{
		try
		{
			driver.findElement(Obj_PaymentPage).isDisplayed();
			MyExtentReporter.executeReport("Step-Mthd_VerifyPaymentsPg", "PASS");
		}
		catch (WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_VerifyPaymentsPg", "FAIL");
		}
	}
	
	public void Mthd_EnterPaymentUser() throws IOException
	{
		try
		{
		driver.findElement(Obj_PaymentUser).sendKeys("Alex");
		implicitwait(3);
		driver.findElement(By.xpath("//a[contains(text(),'Alex')]")).click();
		MyExtentReporter.executeReport("Step-Mthd_EnterPaymentUser", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_EnterPaymentUser", "FAIL");
			
		}
	}
	
	public void Mthd_EnterPaymentAmt(String paymentValue) throws IOException
	{
		try
		{
		//driver.findElement(Obj_PaymentAmt).sendKeys(iTestData.getProperty("PaymentAmt"));	
		driver.findElement(Obj_PaymentAmt).sendKeys(paymentValue);
		MyExtentReporter.executeReport("Step-Mthd_EnterPaymentAmt", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_EnterPaymentAmt", "FAIL");
		}
	}
	
	public void Mthd_PaymentDesc() throws IOException
	{
		try
		{
		driver.findElement(Obj_PaymentDesc).sendKeys(iTestData.getProperty("PaymentDescription"));
		MyExtentReporter.executeReport("Step-Mthd_PaymentDesc", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_PaymentDesc", "FAIL");
		}
	}
	
	public void Mthd_ClickSubmitBtn() throws IOException
	{
		try
		{
		driver.findElement(Obj_PaymentSubmitBtn).click();
		MyExtentReporter.executeReport("Step-Mthd_ClickSubmitBtn", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_ClickSubmitBtn", "PASS");
		}
	}
	
	public void Mthd_ClickConfirmBtn() throws IOException
	{
		try
		{
		driver.findElement(Obj_PaymentConfirmBtn).click();
		MyExtentReporter.executeReport("Step-Mthd_ClickConfirmBtn", "PASS");
		}
		catch(WebDriverException e)
		{
			e.getMessage();
			MyExtentReporter.executeReport("Step-Mthd_ClickConfirmBtn", "FAIL");
		}
	}
	
}
