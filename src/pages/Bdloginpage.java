package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bdloginpage {
	WebDriver Driver;
    By email=By.id("email");
    By password=By.id("password");
    By login=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");

public Bdloginpage(WebDriver Driver)
{
	this.Driver=Driver;
}
public void setvalues(String email1,String password1 )
{
	Driver.findElement(email).sendKeys(email1);
	Driver.findElement(password).sendKeys(password1);
}
public void login()
{
	Driver.findElement(login).click();
}
}


