package org.selenium_operator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPro {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.manage().window().maximize();
		Actions acc = new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath("//input[@name='q']"));
		//findElement.sendKeys("java");
		//Robot r = new Robot();
		acc.keyDown(findElement, Keys.SHIFT).sendKeys("java").keyUp(findElement, Keys.SHIFT).perform();
		
	}

}
