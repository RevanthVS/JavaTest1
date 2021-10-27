package com.ss;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleWindow {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\SeleniumClassnew\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("i phone mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'4rR01T')]) [1]")).click();
		String pW = driver.getWindowHandle();
		Set<String> alWin = driver.getWindowHandles();
		for(String x: alWin) {
			if(x.equals(pW)) {
				driver.switchTo().window(x);
			}		
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
	}

}
