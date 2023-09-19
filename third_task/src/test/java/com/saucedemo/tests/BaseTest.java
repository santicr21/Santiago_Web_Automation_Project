package com.saucedemo.tests;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected static HomePage homePage;

    @Parameters({"url", "username", "password"})
    @BeforeSuite
    public void testSetup(String url, String username, String password) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        loginPage = new LoginPage(this.driver);
        homePage = loginPage.userSignIn(username, password);
    }

    @AfterSuite
    public void webDriverQuit() {
        this.driver.quit();
    }
}
