package com.ss;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\SeleniumClassnew\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gst.gov.in/");
		driver.manage().window().maximize();
	Screenshot scroll = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	ImageIO.write(scroll.getImage(),"PNG",new File("C:\\Users\\elcot\\eclipse-workspace\\SeleniumClassnew\\Screenshot\\REVA.png"));
	driver.quit();
	}
 
}
