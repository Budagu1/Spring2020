package Dropdown;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframm {

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
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(2000);
		// swwith between frame
		driver.switchTo().frame("packageListFrame");
		
		// 3 frame : one start with java.applet ,appletcontext and interface appleet
		// click on java.applet on frame 1
		driver.findElement(By.linkText("java.applet")).click();
		// click on next window (apletContext)
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("AppletContext")).click();
		
		/*
		 * driver.switchTo().parentFrame(); Thread.sleep(2000);
		 */
		
		
	}
}
