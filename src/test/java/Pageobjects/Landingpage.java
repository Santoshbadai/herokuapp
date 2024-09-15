package Pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Landingpage extends Basepage {

	
	public Landingpage (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='text-vertical-center']/h1[1]")
	WebElement headertext;
	
	@FindBy(xpath="//select[@id='combo_facility']")
	WebElement dropdown;
	
	@FindBy(id="chk_hospotal_readmission")
	WebElement checkbox;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	WebElement checkboxes;
	
	@FindBy(xpath="//div[@class='input-group date']/input")
	WebElement calender;
	
	@FindBy(xpath="//textarea[@class='form-control']")
	WebElement comment;
	
	@FindBy(xpath="//div[@class='col-sm-offset-5 col-sm-4']/button")
	WebElement aptbutton;
	
	@FindBy(xpath="//div[@class='col-xs-12 text-center']/h2")
	WebElement confirmmessage;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement gotohome;
	
	public String  headtext() {
	 String	text=headertext.getText();
	 return text;
	}
	
	public void Dropdown(String drop) {
		Select sl=new Select(dropdown);
		sl.selectByValue(drop);
	}
	
	public void CheckBox() {
		checkbox.click();
	}
	
	public void CheckBoxes() {
		checkboxes.click();
	}
		public void Calender(String call) {
			calender.sendKeys(call);
	}
		
		public void Comment(String comm) {
			comment.click();
			comment.sendKeys(comm);
		}
	
	public void SubmitButton(){
		aptbutton.click();
	}
	
	public boolean Confirmation()
	{
		try
		{
		return (confirmmessage.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void GotoHome()
	{
		gotohome.click();
	}
	
	
	
}
