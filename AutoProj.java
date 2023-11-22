package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations .AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoProj {

    ChromeDriver driver;
    @BeforeTest
    public void BT(){
        driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
    }
    @Test(priority=2)
    public void NegitiveTC() {

        WebElement Username = driver.findElement(By.id("login-username"));
        Username.sendKeys("Shivani1997Shrivastava@gmail.com");

        WebElement Password = driver.findElement(By.id("login-password"));
        Password.sendKeys("Qwality@1234");

        //WebElement Rem= driver.findElement(By.id(""))
        WebElement Submit = driver.findElement(By.id("js-login-btn"));
        Submit.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement textt = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(textt.getText());

        Assert.assertTrue(true);

    }

    @Test(priority = 2)
    public void PositiveTC(){
        WebElement Username = driver.findElement(By.id("login-username"));
        Username.sendKeys("Shivani1997Shrivastava@gmail.com");

        WebElement Password = driver.findElement(By.id("login-password"));
        Password.sendKeys("Qwality@12345");

        //WebElement Rem= driver.findElement(By.id(""))
        WebElement Submit = driver.findElement(By.id("js-login-btn"));
        Submit.click();
        Assert.assertTrue(true);

    }
        @AfterTest
        public void CloseBrowser() {
            driver.quit();
        }
    }

