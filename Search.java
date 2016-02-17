package org.messenger.flite.Dashboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Search {
	WebDriver driver;
  @Test(priority=1)
  public void VerifySearchElements() throws InterruptedException {
	  driver.manage().window().maximize();
	  Thread.sleep(40000);
	  WebElement drp=driver.findElement(By.xpath("//*[@id='wrapper']/div/div/div[1]/div[2]/div/form/div[1]/div/div/div[2]/div/div/span/span[2]/span")); 
	  									      //*[@id='wrapper']/div/div/div[1]/div[2]/div/form/div[1]/div/div/div[2]/div/div/span/span[2]/span
	  drp.click();
	  System.out.println(drp.getText());
	 // Select category=new Select(drp);
	  Thread.sleep(2000);
	  drp.sendKeys("FLITE");
      drp.sendKeys(Keys.ENTER);
     
	 //driver.findElement(By.linkText("FLITE")).click();
    // category.selectByVisibleText("FLITE");
   //   List<WebElement> option=category.getOptions();
  //    for(WebElement opt:option)
  //    {
  //  	  if(opt.getText().equalsIgnoreCase("FLITE"))
  //  	  {
  //  		  opt.click();
  //  	  }
  //    }
      
  
  }
  @Test(priority=2)
  public void SearchByName() {
  }
  @Test(priority=2)
  public void SearchByEmail() {
  }
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  driver.get("http://sumit jolly:Quest990@dev-sandbox56.ads.mckinsey.com/#/search");
	 // WebDriverWait wait=new WebDriverWait(driver,10);
	 // Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	 // alert.authenticateUsing(new UserAndPassword("sumit jolly","Quest990"));
	  
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
  }

  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
		   System.setProperty("webdriver.chrome.driver","/Users/tata/Downloads/chromedriver3");    		   
		   ChromeOptions options = new ChromeOptions();
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		 driver = new ChromeDriver(dc); 
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  
	  
  }

}
