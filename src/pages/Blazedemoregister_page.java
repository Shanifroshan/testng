package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemoregister_page {
	WebDriver Driver;
	By bdname=By.name("name");
	By bdcompany=By.name("company");
	By bdmail=By.name("email");
	By bdpass=By.name("password");
	By bdconfirm=By.name("password_confirmation");
	By bdregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Blazedemoregister_page(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	public void setvalues(String name,String company,String email,String password,String confirm)
	{
		Driver.findElement(bdname).sendKeys(name);
		Driver.findElement(bdcompany).sendKeys(company);
		Driver.findElement(bdmail).sendKeys(email);
		Driver.findElement(bdpass).sendKeys(password);
		Driver.findElement(bdconfirm).sendKeys(confirm);
	}
	public void register()
	{
		Driver.findElement(bdcompany).click();
	}

}
