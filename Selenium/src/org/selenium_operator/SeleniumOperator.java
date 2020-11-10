package org.selenium_operator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperator {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		TakesScreenshot tk = (TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\KNOWLEDGE COMPETENCY\\Screenshort.jpg");
		FileUtils.copyFile(screenshotAs, des);
	}
}
