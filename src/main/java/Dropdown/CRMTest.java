package Dropdown;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRMTest {
	
	WebDriver driver;
	String browser = null;
	@BeforeTest
	public void readconf() {
		// to  read file you need this class
		Properties pro = new Properties();
		try {
		// we are tageting this file = browser = chrome)
			
		
			InputStream input = new FileInputStream("C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\src\\main\\java\\config\\config.properties");// ask you to insert file (location of your file (
			pro.load(input); // this is how to combine this file
			browser =pro.getProperty("browser"); // this how to call get 
			// how we are going to pass this file to other methods down
			System.out.println(browser);
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	 // Read the browser
	@BeforeMethod
	public void init() {
		//String browser = "chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser == "firefox") {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
	}
		// driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				driver.get("http://techfios.com/test/billing/?ng=admin/");
				// driver.get("https://www.facebook.com/");
	}
  
		
		
		
  @Test(priority=1) // doing action test
	public void loginTest1() throws InterruptedException{
		// Element Library
		By username_field = By.xpath("(//input[@class='form-control'])[1]");
		By password_field = By.xpath("//input[contains(@type, 'pass')]");
		By sign_button = By.xpath("//*[contains(@class, 'success block') and @type='submit']");
		By Dsh = By.xpath("//span[contains(text(),'Dashboard')]");
		 // data 
		String logid = "techfiosdemo@gmail.com";
		String passid = "abc123";
		
		driver.findElement(username_field).sendKeys(logid);// identifier element and doing action using locator
		driver.findElement(password_field).sendKeys(passid);
		driver.findElement(sign_button).click();
	// explicit wait 
		
		WebforElement(driver,5,Dsh);
		String dashboard_ele = driver.findElement(Dsh).getText();
		Assert.assertEquals("Dashboard", dashboard_ele, "bad page");
		//WebElement dashboard_ele = driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]"));
		//String exp = "Dashboard";
		//Assert.assertEquals("dashboard_ele",Dashboard, "bad page");
		
		
  }
  public void WebforElement(WebDriver driver2, int i, By dsh) {
	  WebDriverWait wait = new WebDriverWait(driver2,i);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dsh));
	// TODO Auto-generated method stub
	
}
@AfterMethod
  public void Teardown() {
	  
	  //driver.close();
	  
	 //driver.quit();
	  
	  // validate assertion (dashboard)
	 //String dashva = driver.findElement(Dsh);
	  //Assert.assertEquals("Dashboard", , message);

		

		
  }
	
	
		
	}


