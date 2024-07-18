package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.jar.asm.Handle;

public class Windowhandle {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://demo.guru99.com/articles_popup.php");
	}
	@Test
	public void test1()
	{
		Driver.manage().window().maximize();
		String parentwindow=Driver.getWindowHandle();
		System.out.println("title is " +Driver.getTitle());
		Driver.findElement(By.xpath("/html/body/p/a")).click();
		
		
		Set<String> allwindowhandles=Driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
		
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			Driver.switchTo().window(handle);
			WebElement mailid=Driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
			mailid.click();
			Driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			Driver.close();
		}
		Driver.switchTo().window(parentwindow);
		
		}
		WebDriver Driver1=Driver.switchTo().newWindow(WindowType.TAB);

}
	
}