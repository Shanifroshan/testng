package automation;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() throws Exception
	{
		//File src=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src, new File("C:\\Screenshot"));
		
		WebElement dayelement1=Driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[1]"));
        File src1=dayelement1.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src1,new File("./Screenshot//Elementscreenshot1.png"));
}
}