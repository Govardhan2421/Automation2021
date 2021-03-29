package base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public  static EventFiringWebDriver e_driver;
public static WebDriverEventListener eventListener;

/*
 * public TestBase(){ try { prop = new Properties(); FileInputStream ip = new
 * FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm" +
 * "/qa/config/config.properties"); prop.load(ip); } catch
 * (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e) {
 * e.printStackTrace(); } }
 */

	public static void initialization(String Browser,String Url)
	{
		if(Browser=="chrome") 
		{
		 System.setProperty("webdriver.chrome.driver","C:/Users/govar/Selenium/2021/chromedriver_win32/chromedriver.exe");
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			  
			driver.get(Url);
		 }
	}
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout)
		.ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
	}


