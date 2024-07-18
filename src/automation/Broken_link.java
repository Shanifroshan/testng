package automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link {
	ChromeDriver Driver;
	String baseurl="https://www.google.co.in";
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get(baseurl);
	}
	@Test
	public void test() throws Exception
	{
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responcecode=con.getResponseCode();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
}
}	


