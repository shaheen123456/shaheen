package com.hrms.lib;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.xml.DOMConfigurator;
import com.utility.Log;

public class General extends Global {
	public void openapplication() {
		Log.info("*******started execution***********"); 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\eZee\\Documents\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		        driver.navigate().to(url); 
		        Log.info("Application Opened Successfully");
	}
	public void waitstatement() throws Exception {
	Thread.sleep(3000);	
	}
	public void closebrowser() {
		driver.quit();
		Log.info("*******End execution***********"); 
	}
	public void verifytitle() {
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}

	}
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
	}
	public void welcometitle() {
		assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
	System.out.println("text matched");
	}
	public void mouseoverandclick() throws Exception {
		WebElement element = driver.findElement(By.linkText("PIM")); 
		Actions action = new Actions(driver); 
		action.moveToElement(element).perform(); 
		Thread.sleep(3000L);
		driver.findElement(By.linkText("Add Employee")).click(); 
		Thread.sleep(3000); 
		System.out.println("Clicked on submenu"); 	
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click(); 
		
		}
	
	public void addemp() {
		System.out.println("adding new emp");
		}
	public void delemp() {
		System.out.println("delete emp");
	}

}
