package Verz.tangsabc;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;


import basetangs.GetURLBE;
import basetangs.base;

public class Base_Countries extends base {
@BeforeTest
  public void pub() {
	driver.get(GetURLBE.be_update_url);

	driver.findElement(By.ByXPath.xpath("//*[@id=\"adminloginform-username\"]")).sendKeys("admin");

	driver.findElement(By.ByXPath.xpath("//*[@id=\"adminloginform-password\"]")).sendKeys("Verz123$%");

	driver.findElement(By.ByXPath.xpath("/html/body/main/div/div/div/div/div/form/div[3]/div/label")).click();

	driver.findElement(By.ByXPath.xpath("//*[@id=\"login-form\"]/div[4]/button")).click();

    // driver.findElement(By.ByXPath.xpath("//*[@id=\"app-container\"]/nav/div[1]/a[1]/svg[2]")).click();
	  
	  driver.findElement(By.ByXPath.xpath("//a[contains(text(),'Master')]")).click();
	 driver.findElement(By.ByXPath.xpath("//ul[2]//li[7]//a[1]")).click();
  }

@AfterClass
public void afterClass(){
	driver.quit();
} 


}
