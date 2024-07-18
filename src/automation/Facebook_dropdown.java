package automation;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/r.php/");
	}
	@Test
	public void test()
	{
	   WebElement dayelement1=Driver.findElement(By.id("day"));
	   Select da=new Select(dayelement1);
	   da.selectByValue("5");
	   List<WebElement>Li= da.getOptions();
	   System.out.println(Li.size());
	   WebElement monthelement1=Driver.findElement(By.id("month"));
	   Select mont=new Select(monthelement1);
	   mont.selectByValue("10");
	   WebElement yearelement2=Driver.findElement(By.id("year"));
	   Select yea=new Select(yearelement2);
	   yea.selectByValue("2008");
	   

}
}
