package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		Driver.get("https://www.facebook.com/");
	}
	@Test
	public void test1() throws IOException
	{
		File f=new File("C:\\Users\\shani\\OneDrive\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);	
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			
			
			Driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			Driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		    Driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
		    Driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);		    
			
		    Driver.findElement(By.name("login")).click();
		    
		    
		    //login validation
		    String actualurl=Driver.getCurrentUrl();
		    System.out.println(actualurl);
		   // String expurl=""
		  //  if(expurl.equals(actualurl))
		   // {
		   // 	System.out.println("login successful")
		  //  }
		   // else
		  //  {
		    	System.out.println("login unsuccessful");
		  //  }
			
		}
		
	}

}
