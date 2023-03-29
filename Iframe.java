package com.demo.Selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Iframe {

	public static void main(String[] args) {
		 ChromeOptions co=new ChromeOptions();
		    co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			
			driver.switchTo().frame(0);
			WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
			WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
			Actions act = new Actions(driver);
			act.dragAndDrop(drag, drop).build().perform();
	}
}
