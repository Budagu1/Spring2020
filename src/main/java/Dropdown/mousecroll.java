package Dropdown;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mousecroll {
	WebDriver driver;

	@Test
	public void launchBrowser() throws InterruptedException {
		// setting properties for chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\driver\\chromedriver.exe");
		// create web driver object
		driver = new ChromeDriver();
		// maximizing window
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// go to to link

		driver.get("https://www.dell.com/en-us");
		// scroll up/down window
		JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeAsyncScript("scroll(0,600)");
}
}
