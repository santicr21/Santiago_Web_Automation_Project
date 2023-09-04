package com.saucedemo.tests;

import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;

    @Parameters("url")
    @BeforeClass
    public void testSetup(String url) {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get(url);
        this.loginPage = new LoginPage(this.driver);
    }

    @AfterClass
    public void webDriverQuit() {
        this.driver.quit();
    }
}
