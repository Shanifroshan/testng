package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Right_click {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1()
	{
		Driver.manage().window().maximize();
	    WebElement rightclk= Driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	    Actions act=new Actions(Driver);
	    act.contextClick(rightclk);
	    act.perform();
	    Driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	    Driver.switchTo().alert().accept();
	    WebElement doubleclk=Driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	    act.doubleClick(doubleclk);
	    act.perform();
	    Driver.switchTo().alert().accept();
	    
	    
	    

	    
	}

}
