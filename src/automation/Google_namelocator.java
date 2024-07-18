package automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_namelocator {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://www.google.co.in");
	}
	@Test
	public void test()
	{
		Driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	}

}
