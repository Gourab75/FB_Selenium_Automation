package Bs_TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.SignUp;

public class Signup_Test extends BaseClass {
	SignUp Signup_Test;

	public Signup_Test() { // constructor create
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		Signup_Test = new SignUp(); // initialize the object
	}

	@Test
	public void Signup_Test() {
		Signup_Test.signup(prop.getProperty("firstname"),prop.getProperty("surname"),prop.getProperty("Email"),prop.getProperty("conf_email"),prop.getProperty("N_Password"),prop.getProperty("date"),prop.getProperty("month"),prop.getProperty("year"));
	}
	
}

