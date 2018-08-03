package com.cg.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;

public class TestCSV {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:/Selenium-java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("D:\\SpringWorkspace\\CSVAssignment\\src\\com\\cg\\test\\signup.html");
		Thread.sleep(1000);

		final String FILE_PATH = "D:\\test.csv";
		CSVReader reader = new CSVReader(new FileReader(FILE_PATH));
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			String fname = nextLine[0];
			String lname = nextLine[1];
			String email = nextLine[2];
			driver.findElement(By.id("fname")).sendKeys(fname);
			Thread.sleep(1000);
			driver.findElement(By.id("lname")).sendKeys(lname);
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys(email);
			Thread.sleep(1000);
			WebElement submitButton2 = driver.findElement(By.id("submit"));
			submitButton2.click();
		}
	}
}
