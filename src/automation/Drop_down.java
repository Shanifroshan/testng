package automation;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
	   WebElement dayelement=Driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	   Select day=new Select(dayelement);
	   day.selectByValue("04");
	   List<WebElement>Li= day.getOptions();
	   System.out.println(Li.size());
	   WebElement monthelement=Driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	   Select month=new Select(monthelement);
	   month.selectByVisibleText("OCT");
	   WebElement yearelement=Driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	   Select year=new Select(yearelement);
	   year.selectByIndex(04);
	   
	}

}
