package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://janasya.com/");
		Driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void clicknew()
	{
		Driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a")).click();
		
	}
	
	@Test(priority=2)
	public void select()
	{
		
	}
	

}
