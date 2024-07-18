package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo {
	@BeforeTest(groups=("sanity"))
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void url()
	{
		System.out.println("url open");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@AfterMethod
	public void report()
	{
		System.out.println("report");
	}
	@AfterTest
	public void close()
	{
		System.out.println("browser close");
	}
	}
	


