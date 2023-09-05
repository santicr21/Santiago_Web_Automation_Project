package com.saucedemo.tests;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @Parameters({"url", "username", "password"})
    @BeforeClass()
    public void testSetup(String url, String username, String password) {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get(url);
        this.loginPage = new LoginPage(this.driver);
        this.homePage = this.loginPage.userSignIn(username, password);
    }

    @AfterClass
    public void webDriverQuit() {
        this.driver.quit();
    }
}
