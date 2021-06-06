package com.grid.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridChromeDemo {
	
	@Test
	public void chromeTestApp() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setBrowserName(BrowserType.CHROME);	
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:49153/wd/hub"),cap);
	
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium Grid docker");
		Thread.sleep(5000);
		driver.quit();


}
}