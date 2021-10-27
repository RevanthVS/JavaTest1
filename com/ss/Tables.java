package com.ss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\SeleniumClassnew\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement date = driver.findElement(By.id("onward_cal"));
	date.click();
	WebElement table = driver.findElement(By.tagName("table"));
	List<WebElement> tRows = table.findElements(By.tagName("tr"));
	for (int i=0; i<tRows.size();i++) {
		WebElement row = tRows.get(i);
		List<WebElement> tData = row.findElements(By.tagName("td"));
	for (int j=0; j<tData.size();j++) {
		WebElement data = tData.get(j);
		String text = data.getText();
		System.out.println(text);
	if (text.equals("15")) 
	data.click();{
	 
		break;	
	}
		

	}
	}
	
	}

}
