package Dropdown;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alertPopup {
	
	WebDriver driver;
	@Test
	public void launchBrowser() throws Exception {
		// setting properties for chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\driver\\chromedriver.exe");
		//create web driver object
		driver = new ChromeDriver();
		//maximizing window
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//go to to link
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		//click on sign in
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
	// click on ok button
		
		driver.switchTo().alert().accept();
	}
}
