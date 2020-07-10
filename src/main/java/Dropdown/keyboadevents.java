package Dropdown;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboadevents {

	WebDriver driver;

	@Test
	public void launchBrowser() {
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

		driver.get("http://techfios.com/test/billing/?ng=admin/");
		// identifying the username box and passing username
		WebElement USERNAME_ELEMENT = driver.findElement(By.id("username"));
		USERNAME_ELEMENT.clear();
		USERNAME_ELEMENT.sendKeys("techfiosdemo@gmail.com");
		// we do not need this is we have
		// //driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		// identifying the passowrd box and passing password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identifying the login button and click on it.
		//driver.findElement(By.name("login")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN).build().perform();;
	}
}
