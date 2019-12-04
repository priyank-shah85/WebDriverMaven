package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	public static WebDriver driver;

	
	@BeforeSuite
	public void setup() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	@Test
	public void doLogin() {

		driver.get("http://google.com");
		driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input"))
				.sendKeys("Way2Automation");
		driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div[1]/a/h3/span")).click();
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}

}
