package MyPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGClass2 {
	WebDriver dr=new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(10000);
	  WebElement e1=dr.findElement(By.name("username"));
	  WebElement e2=dr.findElement(By.name("password"));
	  WebElement e3=dr.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	  e1.click();
	  e1.sendKeys("Admin");
	  e2.click();
	  e2.sendKeys("admin123");
	 
	  e3.click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }

  @AfterTest
  public void afterTest() {
	 // dr.close();
  }

  
}
