package Bs_TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Bs_utility.Utility_test;
import Pages.ForgotPasswrd;
import Pages.Login_Page;

public class ForgotPasswrd_test extends BaseClass {

	ForgotPasswrd fgrtPage;
	Utility_test utility;
	public String SheetName = "Sheet2";
	
	public ForgotPasswrd_test() { // constructor create
		super();
	}

	@BeforeMethod
		public void setup() {
			initialization();
			fgrtPage = new ForgotPasswrd();
			utility= new Utility_test();
	}		

	@DataProvider
	public Object[][] getForgrtPass_Test_Data() {
		Object data[][] = utility.getTestData(SheetName);
		return data;
	}

	@Test(dataProvider = "getForgrtPass_Test_Data")
	public void frgtPass_email(String email) throws InterruptedException {
		fgrtPage.identifyAccnt(email);
	}
}
