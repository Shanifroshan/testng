package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_drop {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
	   WebElement drag= Driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement drop= Driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  Actions act=new Actions(Driver);
	  act.dragAndDrop(drag, drop);
	  act.build().perform();
	  String exp=drop.getText();
	  if(exp.equalsIgnoreCase("Dropped!"))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		System.out.println("fail");  
	  }
	  
    }
}