package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Login_Page extends BaseClass {
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='pass']")
	WebElement pwd;
	
	@FindBy(xpath= "//button[text()='Log in']")
	WebElement login;
	
	
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username ,String password) {
		email.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
	}

	public void multiUserlogin(String Username, String Password) {  //14/22
		email.sendKeys(Username);
		pwd.sendKeys(Password);
		login.click();
	}
}
