package org.testing.Pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPage {
	ChromeDriver driver;
	Properties pr;
	
	public VideoPage(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	
	public void videoPlay() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("videoplay"))).click();
		Thread.sleep(8000);
	}
	
	public void likeVideo() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("likebtn"))).click();
		Thread.sleep(2000);
	}
	
	public void subscribe() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("subscribe"))).click();
		Thread.sleep(2000);
	}
	
	public void Comments() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("playspecificvideo"))).click();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.cssSelector(pr.getProperty("commentsinput"))).click();
		driver.findElement(By.cssSelector(pr.getProperty("comments"))).sendKeys("Nice");

		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("commentbtn"))).click();
	}
	
	public void watchLater() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("watchlater"))).click();
		Thread.sleep(2000);
	}
	
	public void Library() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("library"))).click();
		Thread.sleep(2000);
	}
}
