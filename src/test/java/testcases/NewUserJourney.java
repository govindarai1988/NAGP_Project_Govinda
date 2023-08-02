package testcases;

import static variables.UserVariables.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.HomePage;

public class NewUserJourney {

	@Test
	public void loginAccount() throws InterruptedException {

		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();

		driver.getTitle();
		login(driver);
		Thread.sleep(5000);

		// password change
		// my account page access
		//MytheresaMyAccountPage map = new MytheresaMyAccountPage(driver);
		//changePassword(driver, map);

		//logOut(driver, map);

		driver.close();

	}
	
	private void login(WebDriver driver) {
		HomePage mhp = new HomePage(driver);
		mhp.usernamePath().sendKeys(USERNAME);
		mhp.passwordTextPath().sendKeys(USER_PASSWORD);
		mhp.loginButtonPath().click();
	
	}



}
