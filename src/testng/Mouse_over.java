package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_over {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://www.ebay.com/");
	}
	@Test
	public void test1()
	{
		//implicit wait
		//Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement mouse=Driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]"));
		Actions act=new Actions(Driver);
		act.moveToElement(mouse);
		act.perform();
		
		WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/ul[1]/li[2]/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[1]")));
		
		WebElement smart=Driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/ul[1]/li[2]/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
		act.moveToElement(smart);
		smart.click();
		act.perform();
		
	}

}
