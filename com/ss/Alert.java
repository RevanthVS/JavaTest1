package com.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\SeleniumClassnew\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
		org.openqa.selenium.Alert as = driver.switchTo().alert();
		 String text = as.getText();
		 System.out.println(text);
		 Thread.sleep(3000);
		 as.accept();
	}

}
