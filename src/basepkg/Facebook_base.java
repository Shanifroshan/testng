package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Facebook_base {
        public WebDriver Driver;
        @BeforeTest
        public void setup()
        {
        	Driver=new ChromeDriver();
        	
        }
        @BeforeMethod
        public void url()
        {
        	Driver.get("");
        }
        
}
