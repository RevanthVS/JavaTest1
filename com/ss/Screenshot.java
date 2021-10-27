package com.ss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\SeleniumClassnew\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	TakesScreenshot tk =(TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\elcot\\eclipse-workspace\\SeleniumClassnew\\Screenshot\\fb.png");
	FileUtils.copyFile(source, target);
	}

}
