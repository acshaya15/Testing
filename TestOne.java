package com.Selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestOne
{
	 /**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	  {
	    System.getProperty("Webdriver.chrome.driver", "C:\\Selenium\\Driver.exe");
	    
	    ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(co);
	    driver.get("https://demo.opencart.com/");
//	    WebElement fname=driver.findElement(By.id("input-firstname"));
//	    fname.sendKeys("727821tuad002@skct.edu.in");
//	   driver.findElement(By.xpath("//*[@id=\"search\"]/input"));  
	   WebElement searchBar=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
	   searchBar.click();
	   WebElement button=driver.findElement(By.xpath("//*[@id=\"search\"]/button"));
	   button.click();
		Thread.sleep(4000);
	   driver.navigate().back();
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,1300)","");
		Thread.sleep(3000);
	   WebElement returns=driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a"));
	   returns.click();
	   Thread.sleep(3000);
	   driver.navigate().back();
	   WebElement giftCert=driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a"));
	   giftCert.click();
	   Thread.sleep(3000);
	   driver.navigate().back();
	   js.executeScript("window.scrollBy(0,-1300)","");
	   Thread.sleep(3000);
	   driver.close();
	   
	  }
}
