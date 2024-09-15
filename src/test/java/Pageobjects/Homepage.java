package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {
	
	public Homepage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//i[@class='fa fa-bars']/parent::a")
	WebElement togle;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement Loginbutton;
	
	
	public void toglebar() {
		togle.click();
	}
	
	public void Loginbtn() {
		Loginbutton.click();
	}

}
