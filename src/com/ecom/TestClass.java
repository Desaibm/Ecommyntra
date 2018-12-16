package com.ecom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class TestClass {

	WebDriver driver;

	@Test(enabled = false,priority=1)

	public void launchbrowser() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com");
		//Thread.sleep(3000);

		driver.findElement(By.className("desktop-userIconsContainer")).click();

		driver.findElement(By.className("desktop-linkButton")).click();
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("desaibm@gmail.com");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Desai@123");

		driver.findElement(By.name("mobile")).clear();
		driver.findElement(By.name("mobile")).sendKeys("9483724255");

		driver.findElement(By.id("male")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,250)");
		
		WebDriverWait we11=new WebDriverWait(driver, 30);
		WebElement welement1=we11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='register-register-button']")));
		welement1.click();
		

		driver.close();

	}

	// Login to Ecom application
	@Test(enabled = false,priority=2)
	public void LoginPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);

		driver.findElement(By.className("desktop-userIconsContainer")).click();

		driver.findElement(By.xpath("//a[@data-reactid='530']")).click();

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("desaibm@gmail.com");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Desai@123");

		driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement wb=driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-caret sprites-caret']"));
		
		wb.click();
		
		//wb.isDisplayed();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Edit Profile')]")).click();
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Mahesh");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Babu");
		
		Select date=new Select(driver.findElement(By.id("day")));
		date.selectByIndex(29);
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(11);
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1976");
		
		driver.findElement(By.xpath("//input[@placeholder='Your mobile number']")).clear();
		driver.findElement(By.name("mobile")).sendKeys("9845565462");
		
		driver.findElement(By.name("bio")).clear();
		driver.findElement(By.name("bio")).sendKeys("Good Customer");
		
		driver.findElement(By.name("location")).clear();
		driver.findElement(By.name("location")).sendKeys("Bangalore");
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("scroll(0,650)");
		
		WebDriverWait a=new WebDriverWait(driver, 30);
		WebElement we3= a.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='save']")));
		we3.click();
		driver.close();
		
		}
	

	@Test(enabled=true,priority=3)
	
	public void searchitems() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);

		driver.findElement(By.className("desktop-userIconsContainer")).click();

		driver.findElement(By.xpath("//a[@data-reactid='530']")).click();

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("desaibm@gmail.com");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Desai@123");

		driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).clear();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Pants");
		
		
		WebDriverWait b=new WebDriverWait(driver, 30);
		WebElement we4= b.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")));
		we4.click();
		
		
		
		
		
		//driver.findElement(By.className("myntraweb-sprite desktop-iconSearch sprites-search")).click();
		//driver.findElement(By.className("myntraweb-sprite desktop-iconUser sprites-user")).click();
		//driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-user'])")).click();
		//driver.findElement(By.className("desktop-accInfoSection")).click();
	
		
	
	
	
	}
	//Click Cancel button from Edit profile
	@Test(enabled=false,priority=4)
	public void canceleditprofile() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);

		driver.findElement(By.className("desktop-userIconsContainer")).click();

		driver.findElement(By.xpath("//a[@data-reactid='530']")).click();

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("desaibm@gmail.com");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Desai@123");

		driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement wb5=driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-caret sprites-caret']"));
		wb5.click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Edit Profile')]")).click();
		
		WebDriverWait a4=new WebDriverWait(driver, 30);
		WebElement we6= a4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='cancel']")));
		we6.click();
		
	}
	
	//Verify user changes the Gender from Male to Female
	@Test(enabled = false,priority=2)
	public void Changegender() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);

		driver.findElement(By.className("desktop-userIconsContainer")).click();

		driver.findElement(By.xpath("//a[@data-reactid='530']")).click();

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("desaibm@gmail.com");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Desai@123");

		driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement wb=driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-caret sprites-caret']"));
		
		wb.click();
		
		//wb.isDisplayed();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Edit Profile')]")).click();
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Aadhaya");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Desai");
		
		Select date=new Select(driver.findElement(By.id("day")));
		date.selectByIndex(25);
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(0);
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2014");
		
		driver.findElement(By.xpath("//input[@placeholder='Your mobile number']")).clear();
		driver.findElement(By.name("mobile")).sendKeys("9845565462");
		
		driver.findElement(By.name("bio")).clear();
		driver.findElement(By.name("bio")).sendKeys("Good Customer");
		
		driver.findElement(By.name("location")).clear();
		driver.findElement(By.name("location")).sendKeys("Bangalore");
		
		driver.findElement(By.id("Female")).click();
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("scroll(0,650)");
		
		WebDriverWait a=new WebDriverWait(driver, 30);
		WebElement we3= a.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='save']")));
		we3.click();
		driver.close();
		
		}
}




