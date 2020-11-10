package org.selenium_operator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_progra_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9787410870");
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("9787410870");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(3000);
		WebElement mouse = driver.findElement(By.xpath("(//span[@class='_2FZd5H'])[2]"));
		act.moveToElement(mouse).perform();
		mouse.click();
		Thread.sleep(5000);
		WebElement click3 = driver.findElement(By.xpath("(//a[@class='_1jkBF2'])[1]"));
		act.moveToElement(click3).perform();
		click3.click();
		Thread.sleep(5000);

		WebElement click4 = driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]"));
		act.moveToElement(click4).perform();
		click4.click();
		

	}
}
