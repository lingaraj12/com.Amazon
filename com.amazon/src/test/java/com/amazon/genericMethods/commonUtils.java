package com.amazon.genericMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonUtils {
WebDriverWait wait;
public void acceptalert(WebDriver driver) {
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
public void waitForalert(WebDriver driver) {
wait=new WebDriverWait (baseclass.driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.alertIsPresent());



}
}
