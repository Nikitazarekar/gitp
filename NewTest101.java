package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest101 {
	WebDriver dr=new ChromeDriver();
	
  @Test
  public void f() {
	 dr.get("https://practicetestautomation.com/practice-test-login/");
	 JavascriptExecutor js=(JavascriptExecutor)dr;
	// js.executeScript("window.scrollBy(0,790)");
	 WebElement e1=dr.findElement(By.xpath("//a[@href='https://practicetestautomation.com/privacy-policy/']"));
	 js.executeScript("arguments[0].scrollIntoView(true);", e1);
	 e1.click();
  }
  
}
