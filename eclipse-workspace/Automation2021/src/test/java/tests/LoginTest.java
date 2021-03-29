package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase{
@BeforeTest
public void initialize()
{
	initialization("chrome", "http://automationpractice.com/index.php");
	
}

@Test
public void Login_Test() {
HomePage hp=PageFactory.initElements(driver,HomePage.class);
hp.Login();
LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
lp.Login("vgrvgsvmr94@gmail.com", "Automation2021");
}
@AfterTest
public void close()
{
	driver.quit();
	System.out.println("Sample test case only");
}

}
