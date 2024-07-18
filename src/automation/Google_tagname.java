package automation;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_tagname {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://www.google.co.in");
	}
	@Test
	public void test()
	{
		List<WebElement> li = Driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println(link+"_______"+"____"+text);
					
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
