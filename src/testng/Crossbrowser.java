package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Crossbrowser {
	WebDriver Driver;
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			Driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			Driver=new ChromeDriver();
		}
	}
	@AfterTest
	public void close()
	{
		System.out.println("browser close");
	}

}
