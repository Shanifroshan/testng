package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_grouping {
	@BeforeTest(groups=("sanity"))
	public void setup()
	{
		System.out.println("main1");
	}
	@BeforeMethod(groups=("smoke"))
	public void url()
	{
		System.out.println("main2");
	}
	@Test(groups=("regression"))
	public void test1()
	{
		System.out.println("main3");
	}
	@Test(groups=("functional"))
	public void test2()
	{
		System.out.println("main4");
	}
	@AfterMethod(groups=("performance"))
	public void report()
	{
		System.out.println("main5");
	}
	@AfterTest(groups=("system"))
	public void close()
	{
		System.out.println("main6");
	}
	
}
	


