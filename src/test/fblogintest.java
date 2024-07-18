package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;

public class fblogintest {
	WebDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(Driver);
		ob.setvalues("abcd@gmail.com","abcd");
		ob.login();
	}
	@AfterMethod
	public void report()
	{
		System.out.println("report");
	}
	@AfterTest
	public void close()
	{
		System.out.println("close");
	}

}
