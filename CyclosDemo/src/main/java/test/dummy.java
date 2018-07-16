package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dummy {

	

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Test_Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Actions action = new Actions(driver);
		driver.get("https://demo.cyclos.org/#home");
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul/li[2]/a/span"));
		
	//linear framework
		
		driver.findElement(By.xpath("//span[@class='statusMenuText' and contains(text(),'Sign in')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='inputField medium']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@class='inputField passwordField authenticationInput medium']")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@class='actionButtonText']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gwt-InlineLabel' and contains(text(),'Banking')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//div[@class='selectionIconContainer'])[1]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//div[@class='checkableImageContainer' and @tabindex='0'])[9]")).click();
		driver.findElement(By.xpath("//input[@class='inputField large'][1]")).sendKeys("testing123");
		driver.findElement(By.xpath("//div[@class='actionButtonText' and contains(text(),'Advanced')]")).click();
		//driver.findElement(By.xpath("(//div[@class='checkableImageContainer' and @tabindex='0'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='actionButtonText' and contains(text(),'Search')]")).click();
		//driver.findElement(By.xpath("(//div[@class='selectionIconContainer'])[1]")).click();
		}

}
