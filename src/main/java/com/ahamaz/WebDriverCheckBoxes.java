package com.ahamaz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/ahasan.manzoor.ali/eclipse-workspace/WebDriverAhamaz/src/main/webapp/CheckBoxText.html");
		WebElement checkBox = driver.findElement(By.id("OrangeCheckBox"));
		checkBox.click(); // To Check
		//checkBox.click(); // To UnCheck
	}

}
