package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pageobjects.Homepage;
import Pageobjects.Landingpage;
import Pageobjects.Loginpage;

public class TCC2Landingtest extends BaseClass{

	
	
	@Test(groups={"Regression","Master"})
	public void Landing() {
		
		Homepage hp=new Homepage(driver);
		hp.toglebar();
		hp.Loginbtn();

		Loginpage lp=new Loginpage(driver);
		lp.usn(p.getProperty("username"));
		lp.pwd(p.getProperty("password"));
		lp.sbmit();
		
		
		try {
		Landingpage lpa=new Landingpage(driver);
		lpa.Dropdown(p.getProperty("dropdown"));
		lpa.CheckBox();
		lpa.CheckBoxes();
		lpa.Calender(p.getProperty("Calender"));
		lpa.Comment("appointment");
		lpa.SubmitButton();
		boolean confirm=lpa.Confirmation();
		Assert.assertTrue(confirm);//Assert.assertEquals(targetPage, true,"Login failed");
		lpa.GotoHome();
	}
	catch(Exception e)
	{
		Assert.fail();
	}
		
	}
	
}
