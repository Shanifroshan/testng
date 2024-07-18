package automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_gettitle {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://www.amazon.in");
	}
    @Test
    public void test()
    {
    	String sc=Driver.getTitle();
    	System.out.println(sc);
    	Driver.close();
    	
    }
    @After
    public void browserclose()
    {
    	System.out.println("browser close");
    }
}
