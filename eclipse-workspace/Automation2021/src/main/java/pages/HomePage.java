package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;
import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(className="login")
	WebElement SignOn;
	
	public void Login()
	{
		SignOn.click();	
	}

}
