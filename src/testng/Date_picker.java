package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date_picker {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://www.trivago.com/");
	}
	@Test
	public void test1()
	{
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]")).click();
		while(true)
		{
			WebElement month=Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
			String month1=month.getText();
			if(month1.equals("August 2024"))
			{
				System.out.println(month);
				break;
			}
			else
			{
				Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
			}
		}
		List<WebElement>alldates=Driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button"));
		for(WebElement datelement:alldates)
		{
			String date=datelement.getText();
			System.out.println(date);
			if(date.equals("28"))
			{
				System.out.println(date);
				datelement.click();
				System.out.println("dateselected");
				break;
			}
		}
	}

}
