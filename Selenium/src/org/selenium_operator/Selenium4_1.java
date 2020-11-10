package org.selenium_operator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor java = (JavascriptExecutor)driver;
		TakesScreenshot sc = (TakesScreenshot)driver;
		WebElement mail = driver.findElement(By.id("email"));
		java.executeScript("arguments[0].setAttribute('value','manoj454@gmail.com')",mail);	
		Object executeScript = java.executeScript("return arguments[0].getAttribute('value')",mail);
		String string = executeScript.toString();
		System.out.println(string);
		
		File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\KNOWLEDGE COMPETENCY\\Selenium Screenshot\\Facebookemail.png");
		FileUtils.copyFile(screenshotAs, des);
		
		WebElement pass = driver.findElement(By.name("pass"));
		java.executeScript("arguments[0].setAttribute('value','mmmmmmmmm')",pass);
		Object executeScript2 = java.executeScript("return arguments[0].getAttribute('value')",pass);
		String string2 = executeScript2.toString();
		System.out.println(string2);
		File screenshotAs2 = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\KNOWLEDGE COMPETENCY\\Selenium Screenshot\\FaceBookPass.png");
		FileUtils.copyFile(screenshotAs2, dest);
	

		
	}

}
