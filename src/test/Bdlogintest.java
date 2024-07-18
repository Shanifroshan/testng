package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Bdloginpage;

public class Bdlogintest {
	WebDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://blazedemo.com/login");
	}
	@Test
	public void test()
	{
		Bdloginpage bs=new Bdloginpage(Driver);
		bs.setvalues("shanif@12", "defg");
		bs.login();
	}

}
