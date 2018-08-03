package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignupPage {

	@FindBy(how = How.ID, using = "email")
	WebElement email;
	@FindBy(how = How.ID, using = "number")
	WebElement number;
	@FindBy(how = How.ID, using = "pname")
	WebElement pname;
	@FindBy(how = How.ID, using = "city")
	WebElement city;
	@FindBy(how = How.ID, using = "tsize")
	WebElement tsize;
	
	private static WebElement element = null;

	public static WebElement fname(WebDriver driver) {
		element = driver.findElement(By.id("fname"));
		return element;
	}

	public static WebElement lname(WebDriver driver) {
		element = driver.findElement(By.id("lname"));
		return element;
	}
	
	public static WebElement address(WebDriver driver) {
		element = driver.findElement(By.id("address"));
		return element;
	}

	public static WebElement state(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td[2]/select/option[2]"));
		return element;
	}
	
	public static WebElement cName(WebDriver driver) {
		element = driver.findElement(By.id("cname"));
		return element;
	}
}
