package com.amazon.genericMethods;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import com.amazon.objectRepo.homePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
public static WebDriver driver;
public fileLib fl=new fileLib();
public commonUtils cu=new commonUtils();
public homePage hp;
public String paths="amazonlaunch.properties";

@BeforeTest
public void cinfigBT() throws IOException {
	if(fl.getDataFomProperties(paths, "browser").equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));}
	hp=PageFactory.initElements(driver,homePage.class);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get(fl.getDataFomProperties(paths, "url"));
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}











