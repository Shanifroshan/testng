package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Heroku {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://the-internet.herokuapp.com/");
		Driver.manage().window().maximize();
	}
	@Test
	public void ABtesting()
	{
		Driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a")).click();
	}
	@Test
	public void addremove()
	{
		Driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a")).click();
		Driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
		Driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
	}
	@Test
	public void basicauth()
	{
		Driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();
		
	}
	@Test
	public void brokenimage()
	{
		Driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[4]/a")).click();
		WebElement actualtext=Driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		String text=actualtext.getText();
		if(actualtext.equals("Broken images"))
		{
			System.out.println("text verified");
		}
		else
		{
			System.out.println("text not verified");
		}
		
	}
	@Test
	public void checkboxes()
	{
		Driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
		boolean b1=Driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
		if(b1)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("is not sucess");
		}
	}
	@Test
	public void rightclick()
	{
		Driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a")).click();
		WebElement rightclk=Driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions act=new Actions(Driver);
		act.contextClick(rightclk);
		act.perform();
		Driver.switchTo().alert().accept();
				
	}
	@Test
	public void dragdrop()
	{
		Driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[10]/a")).click();
		WebElement drag=Driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
		WebElement drop=Driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
		Actions act=new Actions(Driver);
		act.dragAndDrop(drag, drop);
		act.perform();
				
	}
	@Test
	public void entryad()
	{
		Driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[15]/a")).click();
		
	}
	
	
	
	
	
		
	
}
