package automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_textverification {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement actualtext=Driver.findElement(By.xpath("//input[@id='Register']"));
		String button=actualtext.getAttribute("value");
		if(button.equals("Create my account >>"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	

}
