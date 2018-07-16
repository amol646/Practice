package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseClass.Source_Code;

public class MyExtentReporter extends Source_Code
{

	static ExtentReports exReport;
	static ExtentTest exTest;
	
 public static void initializeReport()
 {
 
	String mytimeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	String extrprtpath = "D:\\Test_Automation\\CyclosDemo\\test-output\\TestExecutionReports\\" + "TestExecutionReport" +"_" + mytimeStamp +".html" ;
 
	exReport = new ExtentReports(extrprtpath, true);
	
	
 }
 
 public static void initializeTestcase(String TCid)
 {
	 exTest = exReport.startTest(TCid);
 }
 
 public static void executeReport(String Stepdesc , String Stepstatus) throws IOException
 {
	 
	 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());	 
	 //TakesScreenshot takescrn = (TakesScreenshot) driver;
	 //File SrcFile =  takescrn.getScreenshotAs(OutputType.FILE);
	 
	
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File DestFile = new File("D:\\Test_Automation\\CyclosDemo\\test-output\\TestExecutionReports\\Screenshots\\" +"TC1" +timeStamp + ".jpg");
	 Files.copy(scrFile, DestFile);
	 
	 //exTest.log(LogStatus.PASS, "steppassed");
	 
	 if(Stepstatus.equals("PASS"))
	 {
		 exTest.log(LogStatus.PASS,Stepdesc + exTest.addScreenCapture("D:\\Test_Automation\\CyclosDemo\\test-output\\TestExecutionReports\\Screenshots\\" + "TC1" +timeStamp + ".jpg")  );
		 
		 
		 
	 }
	 
	 if(Stepstatus.equals("FAIL"))
	 {
		 exTest.log(LogStatus.FAIL,Stepdesc + exTest.addScreenCapture("D:\\Test_Automation\\CyclosDemo\\test-output\\TestExecutionReports\\Screenshots\\" + "TC1" +timeStamp + ".jpg"));
		 
	 }
	 
	 
 }
 
 public static void endReport()
 {
	 exReport.endTest(exTest);
	 exReport.flush();
 }



	


	
}


/*public class MyExtentReporter implements IReporter{
	
	
	ExtentReports extentReporter ; 

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
		// TODO Auto-generated method stub
		extentReporter = new ExtentReports(outputDirectory + File.separator
				+ "Extent.html", true);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
			}
		}

		extentReporter.flush();
		extentReporter.close();
		
	}

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extentReporter.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extentReporter.endTest(test);
			}
		}
	}
	
	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
}*/




 

