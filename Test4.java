package pack4;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Test4 {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver ; 
     @AfterTest                            //Jumbled
      public void terminateBrowser(){
          driver.close();
      }
     @BeforeTest                            //Jumbled
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
          System.setProperty("webdriver.firefox.marionette", driverPath);
          driver = new FirefoxDriver();
          driver.get (baseUrl);
      }
      @Test                                //Jumbled
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
comment auther
     }
      
}