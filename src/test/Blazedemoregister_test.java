package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazedemoregister_page;

public class Blazedemoregister_test {
	WebDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		Blazedemoregister_page bd=new Blazedemoregister_page(Driver);
		bd.setvalues("shanif", "blazedemo", "shanif@email", "abcd", "confirm");
		bd.register();
	}

}
