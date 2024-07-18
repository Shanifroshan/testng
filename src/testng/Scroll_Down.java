package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scroll_Down {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://www.amazon.in");
	}
	@Test
	public void test1()
	{
		//pixel
		/*JavascriptExecutor js=(JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();*/
		    
		// until find element
		//JavascriptExecutor js=(JavascriptExecutor) Driver;
		//js.executeScript("arguement[0].scrollIntoview();",Driver.findElement(By.xpath("//*[@id=\\\"navFooter\\\"]/div[5]/ul/li[2]/a")));
		
		//bottom
		JavascriptExecutor js=(JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();
		
	}

}
