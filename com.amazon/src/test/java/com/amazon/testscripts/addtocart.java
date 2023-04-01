package com.amazon.testscripts;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.genericMethods.baseclass;

public class addtocart extends baseclass {

@Test
public void addtocarttset() throws InterruptedException {
	hp.getHome().click();
	try {
		hp.getQuantity().click(); }
catch (NoSuchElementException e){
	System.out.println("clicked");
}
  
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	hp.getQuantity1().click();
	Reporter.log("landed on pdt details page",true);
	hp.getAddtocart().click();
	hp.getViewcart().click();
	hp.getCheckout().click();
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
