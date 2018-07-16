package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.Source_Code;
import Utilities.ExcelUtilities;
import Utilities.MyExtentReporter;


public class TC002_PaymentsPage extends Source_Code
{
	@Test
	public void TC002_VerifyPaymentsPage() throws Exception
	
	{
	
		MyExtentReporter.initializeTestcase("TC002_VerifyPaymentsPage");
		LoginintoCyclosApplication();
		
		obj_PaymentsPg = obj_WelcomePg.Mthd_ClickPaymentsUserTab();
		implicitwait(10);
		obj_PaymentsPg.Mthd_VerifyPaymentsPg();
		obj_PaymentsPg.Mthd_EnterPaymentUser();
		//obj_PaymentsPg.Mthd_EnterPaymentAmt();
		obj_PaymentsPg.Mthd_EnterPaymentAmt(ExcelUtilities.getTestData("TC002", "PaymentAmt"));
		obj_PaymentsPg.Mthd_PaymentDesc();
		obj_PaymentsPg.Mthd_ClickSubmitBtn();
		//obj_PaymentsPg.Mthd_ClickConfirmBtn();
		
		
		
	}

}
