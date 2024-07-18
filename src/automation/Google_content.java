package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_content {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String actualcontent=driver.getPageSource();
		if(actualcontent.contains("gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
