package automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_alert {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Test
	public void test()
	{
		Driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/button[1]")).click();
		Driver.switchTo().alert().accept();
		Driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/button[1]")).click();
		Driver.switchTo().alert().dismiss();
		Driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Driver.switchTo().alert().sendKeys("shanif");
		Driver.switchTo().alert().accept();
		

    }
}