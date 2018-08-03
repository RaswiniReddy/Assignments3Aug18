package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;

	public static WebElement signUp(WebDriver driver) {

		element = driver.findElements(By.id("submit")).get(0);

		return element;

	}
}
