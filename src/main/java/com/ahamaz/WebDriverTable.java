package com.ahamaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/ahasan.manzoor.ali/eclipse-workspace/WebDriverAhamaz/src/main/webapp/TableTest.html ");

		//WebElement outerTable = driver.findElement(By.tagName("table"));
		//WebElement innerTable = outerTable.findElement(By.tagName("table"));
		//WebElement row = innerTable.findElements(By.tagName("td")).get(1);
		//System.out.println(row.getText());
		
		//Replacing three line with one line using X-Path
		WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		System.out.println(row.getText());
		
		// 
		
	}

}
