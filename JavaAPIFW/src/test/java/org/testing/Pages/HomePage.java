package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	ChromeDriver driver;
	Properties pr;
	
	public HomePage(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void trending() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath(pr.getProperty("trending"))).click();
		Thread.sleep(2000);
	}
	
	public void history() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("history"))).click();
		Thread.sleep(2000);
	}
	
	public void subscriptions() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("subscriptions"))).click();
		Thread.sleep(2000);
	}
}
