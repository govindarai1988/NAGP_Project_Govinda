package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(id = "myaccount")
	WebElement myaccount_link;

	@FindBy(xpath = "//*[@id=\"customer_flyout_login_info\"]/div/div/button")
	WebElement create_account_button;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login_button;

	// constructor method
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement myAccountLinkPath() {
		return myaccount_link;
	}

	public WebElement usernamePath() {
		return username;
	}
	
	public WebElement passwordTextPath() {
		return password;
	}
	
	public WebElement loginButtonPath() {
		return login_button;
	}
	
	public WebElement createButtonClickPath() {
		return create_account_button;
	}

}
