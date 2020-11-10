package org.selenium_operator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.interactions.Actions;

public class ActionClass_progra_screen {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("HP laptop");
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span/i")).click();
		Thread.sleep(6000);
		TakesScreenshot tk = (TakesScreenshot) driver;
		WebElement click = driver.findElement(By.xpath("/html/body"));

		File screenshotAs = click.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\KNOWLEDGE COMPETENCY\\Selenium Screenshot\\screenshot5.jpg");
		FileUtils.copyFile(screenshotAs, des);

	}

}
