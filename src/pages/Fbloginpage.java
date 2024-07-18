package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	//object repository
	WebDriver Driver;
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	//constructor
	public Fbloginpage(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	//method
	public void setvalues(String email,String password)
	{
		Driver.findElement(fbemail).sendKeys(email);
		Driver.findElement(fbpassword).sendKeys(password);
	
	}
	public void login()
	{
		Driver.findElement(fblogin).click();
	}
	
	
	

}
