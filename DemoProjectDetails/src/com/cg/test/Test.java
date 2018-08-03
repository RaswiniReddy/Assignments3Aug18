package com.cg.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:/Selenium-java/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("D:\\SpringWorkspace\\DemoProjectDetails\\src\\com\\cg\\test\\signup.html");
		Thread.sleep(1000);
		SignupPage page = PageFactory.initElements(driver, SignupPage.class);

		SignupPage.fname(driver).sendKeys("raswini");
		Thread.sleep(1000);
		SignupPage.lname(driver).sendKeys("Reddy");
		Thread.sleep(1000);
		page.email.sendKeys("raswinireddy@gmail.com");
		Thread.sleep(1000);
		page.number.sendKeys("8019413949");
		Thread.sleep(1000);
		SignupPage.address(driver).sendKeys("flat no:109");
		Thread.sleep(1000);
		page.city.sendKeys("Hyderabad");
		Thread.sleep(1000);
		SignupPage.state(driver).click();
		Thread.sleep(1000);
		page.email.submit();
		Thread.sleep(1000);
		page.pname.sendKeys("XYZ");
		Thread.sleep(1000);
		SignupPage.cName(driver).sendKeys("Google");
		Thread.sleep(1000);
		page.tsize.sendKeys("10");
		Thread.sleep(1000);
		page.tsize.submit();
	}

}
