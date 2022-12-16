package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class ForgotPasswrd extends BaseClass {

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	WebElement fgrtPass;

	@FindBy(xpath = "//input[@id='identify_email']")
	WebElement email_identity;

	@FindBy(xpath = "//button[text()='Search']")
	WebElement search_click;

	public ForgotPasswrd() {
		PageFactory.initElements(driver, this);
	}

	public void identifyAccnt(String email) throws InterruptedException {
		fgrtPass.click();
		Thread.sleep(5000);
		email_identity.sendKeys(email);
		Thread.sleep(3000);
		search_click.click();
		
//		driver.close();
		
	}
	
}