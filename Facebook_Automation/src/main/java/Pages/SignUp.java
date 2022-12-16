package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SignUp extends BaseClass {

	@FindBy(linkText = "Create New Account")
	WebElement NewAcc;

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement F_Nm;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement L_Nm;

	@FindBy(xpath = "//input[@name='reg_email__']")
	WebElement Eml;

	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	WebElement Eml_Conf;

	@FindBy(xpath = "//input[@id='password_step_input']")
	WebElement N_pwd;

	@FindBy(xpath = "//select[@name='birthday_day']")
	WebElement Date;

	@FindBy(xpath = "//select[@name='birthday_month']")
	WebElement Month;

	@FindBy(xpath = "//select[@name='birthday_year']")
	WebElement Year;

	@FindBy(xpath = "//input[@name='sex'][@value=2]")
	WebElement Gender;

	@FindBy(name = "websubmit")
	WebElement Submit;

	public SignUp() {
		PageFactory.initElements(driver, this);
	}

	public void signup(String firstname, String surname, String email, String conf_email, String N_password,
			String B_Date, String B_Month, String B_Year) {

		NewAcc.click();
		F_Nm.sendKeys(firstname);
		L_Nm.sendKeys(surname);
		Eml.sendKeys(email);
		Eml_Conf.sendKeys(conf_email);
		N_pwd.sendKeys(N_password);
		Date.sendKeys(B_Date);
		Month.sendKeys(B_Month);
		Year.sendKeys(B_Year);
		Gender.click();
		Submit.click();
	}
}