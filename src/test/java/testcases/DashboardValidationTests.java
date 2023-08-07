package testcases;

import static variables.UserVariables.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;
import objectrepository.HomePage;

public class DashboardValidationTests {

	
	@Test
	public void checkDashboard() throws InterruptedException {
		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();

		driver.getTitle();
		login(driver);
		
		Assert.assertTrue(true);
		driver.close();
	}
	

	private void login(WebDriver driver) {
		HomePage mhp = new HomePage(driver);
		mhp.usernamePath().sendKeys(USERNAME);
		mhp.passwordTextPath().sendKeys(USER_PASSWORD);
		mhp.loginButtonPath().click();
	
	}



}
