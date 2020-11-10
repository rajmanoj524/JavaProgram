package org.selenium_operator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass_progra_scroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement Element = driver.findElement(By.name("country"));
		Select select = new Select(Element);
		
		
		
	/*	List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement x : allSelectedOptions) {
			String text = x.getText();
			System.out.println(text);
		}*/
		
		
		/*
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
		*/
		
		
		/*/List<WebElement> options = select.getOptions();
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
			if (text.equals("ANDORRA")) {
				select.selectByVisibleText("ANDORRA");*/
			}
		
		

	}




