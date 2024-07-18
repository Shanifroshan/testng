package automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		Driver.findElement(By.name("name")).sendKeys("shanif");
		Driver.findElement(By.name("company")).sendKeys("blazedemo");
		Driver.findElement(By.name("email")).sendKeys("shanif@gamil.com");
		Driver.findElement(By.name("password")).sendKeys("abcd");
		Driver.findElement(By.name("password_confirmation")).sendKeys("abcd");
		
	}
	

}
