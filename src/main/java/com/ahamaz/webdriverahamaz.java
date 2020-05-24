package com.ahamaz;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class webdriverahamaz {
	
	public static void main(String[] args) throws Exception {
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
					DesiredCapabilities.chrome());
			driver.get("http://google.com");
		
		
		// Entering search term into google search.
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Accenture");
		searchField.submit();
		
		//Implicit time wait.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click and open the Images page.
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		//Clicking an image on the Image page:
		driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[1]/div[1]/img")).click();
	}
}
