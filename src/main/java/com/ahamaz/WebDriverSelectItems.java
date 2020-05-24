package com.ahamaz;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSelectItems {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/ahasan.manzoor.ali/eclipse-workspace/WebDriverAhamaz/src/main/webapp/SelectItemTest.html");
		
		WebElement selectElement = driver.findElement(By.id("select"));
		Select select = new Select (selectElement); // To Check
		select.selectByVisibleText("Maybe");
	}
}
