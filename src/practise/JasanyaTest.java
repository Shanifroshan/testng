package practise;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class JasanyaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("https://janasya.com/");
    driver.manage().window().maximize();
  }
 
  @Test
  public void jasanya() {
    
    driver.findElement(By.cssSelector(".menu-lv-item:nth-child(1) .text")).click();
    driver.findElement(By.cssSelector(".limited-view > .label-tab")).click();
    driver.findElement(By.cssSelector(".limited-view > .dropdown-menu")).click();
    driver.findElement(By.cssSelector(".sidebar-categories:nth-child(1) .sidebarBlock-heading")).click();
    driver.findElement(By.cssSelector(".limited-view li:nth-child(2) > .text")).click();
    driver.findElement(By.cssSelector(".sidebarBlock:nth-child(1) .navPages-item:nth-child(1) .text")).click();
    driver.findElement(By.cssSelector(".product:nth-child(1) .media--loading-effect > .card-link")).click();
    js.executeScript("window.scrollTo(0,239.2615509033203)");
    driver.findElement(By.id("product-add-to-cart")).click();
    driver.findElement(By.cssSelector(".button-view-cart")).click();
    driver.findElement(By.cssSelector(".button-continue")).click();
    driver.findElement(By.cssSelector(".menu-lv-item:nth-child(3) .menu-lv-item:nth-child(3) .text")).click();
  }
  @After
  public void tearDown() 
  {
    driver.quit();
  }
}
