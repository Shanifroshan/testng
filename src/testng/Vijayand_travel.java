package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vijayand_travel {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://www.vrlbus.in/#/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void test1()
	{
		Driver.findElement(By.xpath("//*[@id=\"largeModal\"]/div/div/button")).click();
		
	    //Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //JavascriptExecutor js=(JavascriptExecutor) Driver;
		//js.executeScript("arguement[].scrollIntoview();",Driver.findElement(By.xpath("//*[@id=\\\"From City\\\"]")));
		//Driver.findElement(By.xpath("//*[@id=\"From City\"]")).clear();
		
		
		
		
		
		
		Driver.findElement(By.xpath("//*[@id=\"From City\"]")).sendKeys("bangalore");
		
		
		Driver.findElement(By.xpath("//*[@id=\"ToCity\"]")).sendKeys("mumbai");
		while(true)
		{
			WebElement month=Driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[2]"));
			String month1=month.getText();
			if(month1.equals("OCTOBER 2024"))
			{
				System.out.println(month);
				break;
			}
			else
			{
				Driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[3]")).click();
			}
		}
		List<WebElement>alldates=Driver.findElements(By.xpath("/html/body/div/div[1]/table/tbody/tr"));
		for(WebElement datelement:alldates)
		{
			String date=datelement.getText();
			System.out.println(date);
			if(date.equals("29"))
			{
				System.out.println(date);
				datelement.click();
				System.out.println("dateselected");
				break;
			}
		
		}
		Driver.findElement(By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[2]/div/div/div/div/div/div[3]/button")).click();
	}


	
	
}

