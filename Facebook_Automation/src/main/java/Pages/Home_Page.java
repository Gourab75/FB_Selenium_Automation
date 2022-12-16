package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Home_Page extends BaseClass {
	@FindBy(linkText = "Friends")
	WebElement frnd;

	@FindBy(xpath = "//span[text()='All Friends']")
	WebElement allFrnds;

	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

	public void performActions() throws InterruptedException{
		Actions actn = new Actions(driver);
		actn.click(frnd);
		Thread.sleep(3000);
//		actn.click(allFrnds);
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
	}
}