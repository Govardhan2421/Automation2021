package pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase  {
	
	@FindBy(id="email")
	WebElement Id;
	
	@FindBy(name="passwd")
	WebElement Password;
	
	@FindBy(id="SubmitLogin")
	WebElement Submit_Button;
	
	public void Login(String email, String Pd)
	{
		Id.sendKeys(email);
	    Password.sendKeys(Pd);
	    Submit_Button.click();
	}
	
	public void takeSS(WebDriver driver)
	{
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		//FileUtils.copyFile(src, new File("C/Users/govar/Selenium/2021/google.png"));
	}

}
