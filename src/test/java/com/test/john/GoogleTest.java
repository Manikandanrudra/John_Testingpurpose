package com.test.john;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // important for Jenkins

        driver = new ChromeDriver(options);
    }

    @Test
    public void testGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle())
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
