package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_rishi {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test1()
	{
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a")).click();
		WebElement reg=Driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a"));
		Actions act=new Actions(Driver);
		act.moveToElement(reg);
		reg.click();
		act.perform();
		Driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("shanif@");
		Driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("abc");
		Driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		Driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/form/div[1]/input")).sendKeys("shanifk3");
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/form/div[2]/input")).sendKeys("vcjdff");
		Driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		Driver.findElement(By.xpath("//*[@id=\"ls-email-signin-overlay-v1\"]/div/div/div[1]/button")).click();
		Driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("herbal agro growth booster");
		Driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[1]/div/div[2]/div/a")).click();
		Driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		Driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button")).click();
		Driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		Driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		Driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		Driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[5]/a")).click();
		JavascriptExecutor js=(JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
