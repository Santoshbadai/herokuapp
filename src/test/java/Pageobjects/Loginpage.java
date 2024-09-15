package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {

	
	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//div[@class='col-sm-8']/child::input)[1]")
	WebElement username;
	
	@FindBy(xpath="(//div[@class='col-sm-8']/child::input)[2]")
	WebElement password;
	
	@FindBy(xpath="//button[contains(@id,'btn')][1]")
	WebElement submit;
	
	public void usn(String usn) {
		username.sendKeys(usn);
	}
	
	public void pwd(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void sbmit() {
		submit.click();
	}
	
}
