package org.selenium_operator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_progra_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/drag_drop.html ");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		WebElement target = driver.findElement(By.id("bank"));
		act.dragAndDrop(source, target).perform();

		WebElement source1 = driver.findElement(By.xpath("(//a[contains(text(),' 5000')])[1]"));
		WebElement target1 = driver.findElement(By.id("amt7"));
		act.dragAndDrop(source1, target1).perform();

		WebElement source2 = driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
		WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act.dragAndDrop(source2, target2).perform();

		WebElement sourcr3 = driver.findElement(By.xpath("(//a[contains(text(),' 5000')])[2]"));
		WebElement target3 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(sourcr3, target3).perform();

	}

}
