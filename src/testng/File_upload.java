package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_upload {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://www.ilovepdf.com/");
	}
	@Test
	public void test1()
	{
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[6]/a")).click();
		Driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		fileUpload("C:\\SHANIF ROSHAN_QA INTERN.pdf");
	}
	public void fileUpload(String p) 
	{
		//copy to clipboard
		/*StringSelection strselection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		to paste in go system window
		Robot robot=new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);*/
		
		
		
		
	
		
		
		
		
	
		
	}

}
