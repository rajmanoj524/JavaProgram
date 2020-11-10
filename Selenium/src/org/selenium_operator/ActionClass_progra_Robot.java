package org.selenium_operator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_progra_Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement click = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		click.sendKeys("9787410870");

		WebElement findElement = driver.findElement(By.xpath("(//input[@type='password'])"));
		findElement.sendKeys("9787410870");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		WebElement product = driver.findElement(By.xpath("//p[text()='Mobiles']"));
		act.contextClick(product).perform();
		Thread.sleep(5000);
		Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
