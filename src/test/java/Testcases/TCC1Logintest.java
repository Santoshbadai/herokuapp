package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pageobjects.Homepage;
import Pageobjects.Landingpage;
import Pageobjects.Loginpage;

public class TCC1Logintest extends BaseClass {

	@Test(groups={"Sanity","Master"})
	public void Login() {
		
		Homepage hp=new Homepage(driver);
		hp.toglebar();
		hp.Loginbtn();

		Loginpage lp=new Loginpage(driver);
		lp.usn(p.getProperty("username"));
		lp.pwd(p.getProperty("password"));
		lp.sbmit();
		
		Landingpage lg=new Landingpage(driver);
		String is=lg.headtext();
		
		Assert.assertEquals(is, "CURA Healthcare Service");
		
		System.out.println("login got succesfull");
		
		
		
	}
}
