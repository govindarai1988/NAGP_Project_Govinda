package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(id = "myaccount")
	WebElement myaccountLink;

	@FindBy(xpath = "//*[@id=\"customer_flyout_login_info\"]/div/div/button")
	WebElement createAccountButton;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;

	// constructor method
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement myAccountLinkPath() {
		return myaccountLink;
	}

	public WebElement usernamePath() {
		return username;
	}
	
	public WebElement passwordTextPath() {
		return password;
	}
	
	public WebElement loginButtonPath() {
		return loginButton;
	}
	
	public WebElement createButtonClickPath() {
		return createAccountButton;
	}

}
