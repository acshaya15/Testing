package com.demo.Selenium1;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    
//    	WebDriverManager.chromedriver().setup();
    	  ChromeOptions co=new ChromeOptions();
   	    co.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(co);
        driver.get("https://skct892.examly.io/login");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("727821tuad002@skct.edu.in");
        
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/div/app-button/button"));
        btn.click();
        
        Thread.sleep(5000);
       WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
       pass.sendKeys("727821tuad002");
       
       WebElement send=driver.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/div/app-button/button"));
       send.click();
       
       Thread.sleep(5000);
       WebElement link=driver.findElement(By.xpath("/html/body/app-root/div/app-sidebar/div/ul/li[7]/a/div"));
       link.click();
       Thread.sleep(2000);
       
       WebElement lab=driver.findElement(By.xpath("/html/body/app-root/div/app-sidebar/div[2]/ul/li[7]/div/ul/li[6]/div/div[1]"));
       lab.click();
    }
}
