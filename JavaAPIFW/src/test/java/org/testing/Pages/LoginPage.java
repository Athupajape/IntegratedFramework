package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	ChromeDriver driver;
	Properties pr;
	
	public LoginPage(ChromeDriver driver,Properties pr){
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signIn(String userName,String password) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("signin"))).click();
		
		driver.findElement(By.xpath(pr.getProperty("loginemail"))).sendKeys(userName);
		driver.findElement(By.xpath(pr.getProperty("loginemailbtn"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pr.getProperty("loginpwd"))).sendKeys(password);
		driver.findElement(By.xpath(pr.getProperty("loginpwdbtn"))).click();
		Thread.sleep(3000);
	}
	
	public void signout() throws InterruptedException {
		driver.findElement(By.id(pr.getProperty("signoutIconid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("signout"))).click();
		Thread.sleep(2000);
	}
}
