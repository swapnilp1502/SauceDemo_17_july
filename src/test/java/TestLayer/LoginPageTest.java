package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class LoginPageTest extends BaseClass {
    @BeforeTest   
	public void setUp()
	{
    	BaseClass.initialization();
	}
    @Test
    public void validate() {
    	driver.findElement(By.name("user-name")).sendKeys("standard_user");
    	driver.findElement(By.name("password")).sendKeys("secret_sauce");
    	driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
   
    	driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
    	driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
    	
    	driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
    	
    }
}
