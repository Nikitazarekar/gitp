package MyPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void login() {
	  System.out.println(" I am in test cases");
  }
  
  @Test
  public void login1() {
	  System.out.println(" I am in test cases");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" I am in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" I am in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" I am in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" I am in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" I am in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" I am in after case");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" I am in before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" I am in after suite");
  }

}
