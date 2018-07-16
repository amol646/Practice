package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.Source_Code;
import Utilities.MyExtentReporter;

public class TC003_PlaceAdPage extends Source_Code
{
	@Test
	public void TC003_PlaceAdvertisement() throws InterruptedException, IOException
	{
	
		MyExtentReporter.initializeTestcase("TC003_PlaceAdvertisement");
		LoginintoCyclosApplication();
		Obj_PlaceAdPg = obj_WelcomePg.Mthd_ClickPlaceAd();
		Obj_PlaceAdPg.Mthd_VerifyPlaceAdPg();
		Obj_PlaceAdPg.Mthd_EnterAdTitle();
		Obj_PlaceAdPg.Mthd_EnterAdCategory();
		Obj_PlaceAdPg.Mthd_EnterAdPrice();
		Obj_PlaceAdPg.Mthd_AdIsHidden();
		Obj_PlaceAdPg.Mthd_EnterAdDescription();
		Obj_PlaceAdPg.Mthd_EnterAdTypeasDemand();
		Obj_PlaceAdPg.Mthd_ClickonSaveBtn();	
	
	}
	
} // End of Class
