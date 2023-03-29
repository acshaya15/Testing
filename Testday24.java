package com.Selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testday24 {
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\Driver.exe");
		  
	    ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		//launching url
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		fname.sendKeys("Acshaya Sri");
		
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lname.sendKeys("S");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
		email.sendKeys("acsh@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		pass.sendKeys("acsh123");
		
		WebElement gen=driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]"));
		gen.click();
		
		WebElement dob=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[2]/div[1]/div[1]/div/span/input[1]"));
		dob.click();
		
		WebElement day=driver.findElement(By.xpath(""));
		day.click();
	}
}
