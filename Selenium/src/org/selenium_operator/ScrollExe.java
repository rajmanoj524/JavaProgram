package org.selenium_operator;

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
import org.openqa.selenium.support.ui.Select;


public class ScrollExe {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		
		//Robot r= new Robot();
		
		WebElement scrollDown = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		Select state = new Select(scrollDown);
		state.selectByIndex(1);
		
		/*for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		scrollDown.
		
		WebElement click = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		act.moveToElement(click).perform();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement scr = driver.findElement(By.xpath("//div[@class='col-lg-3 right-section']"));

		File screenshotAs = scr.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\KNOWLEDGE COMPETENCY\\Selenium Screenshot\\screenshot1.jpg");
		FileUtils.copyFile(screenshotAs, des);
*/
	}

}
