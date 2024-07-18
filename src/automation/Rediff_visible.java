package automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_visible {
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
	Boolean b1=Driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	   if(b1)
	   {
		   System.out.println("displayed");
	   }
	   else
	   {
		   System.out.println("not displayed");
	   }
	    	
	    
		
		Boolean c1=Driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[15]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).isSelected();
		
		if(c1)
		{
			System.out.println("is selected");
		}
		else
		{
			System.out.println("is not selected");
		}

    }
}