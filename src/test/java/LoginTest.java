import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Secure shell cryptography
public class LoginTest {
public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		 System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\LatestDriverJars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
	
	@Test
	public void doLogin(){
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vairajapu@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("vai2017raj");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		}
	
	@AfterTest
	public void QuitDriver(){
	if (driver!=null)
		driver.close();
	}
	

}
