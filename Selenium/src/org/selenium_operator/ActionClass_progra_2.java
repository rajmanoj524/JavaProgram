package org.selenium_operator;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_progra_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		Actions act = new Actions(driver);
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		WebElement mouse = driver.findElement(By.xpath("//span[text()='Prime']"));
		act.moveToElement(mouse).perform();
		WebElement click = driver.findElement(By.xpath("//span[text()='Prime']"));
		click.click();
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\KNOWLEDGE COMPETENCY\\Selenium Screenshot\\cv.jpg");
		FileUtils.copyFile(screenshotAs, des);


	}

}
