package com.ss;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotNew {
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\SeleniumClassnew\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gst.gov.in/");
		driver.manage().window().maximize();
		TakesScreenshot vs = (TakesScreenshot)driver;
		File source = vs.getScreenshotAs(OutputType.FILE);
		String title = driver.getTitle();
		File target = new File("C:\\Users\\elcot\\eclipse-workspace\\SeleniumClass\\Screenshot\\"+title+".png");
		FileUtils.copyFile(source, target);
		

	}

}
