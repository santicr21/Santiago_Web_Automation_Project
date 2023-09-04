package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return this.wait;
    }

    public void click(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public boolean IsElementVisible(WebElement element) {
        boolean answer = false;

        try {
            getWait().until(ExpectedConditions.invisibilityOf(element));
        }
        catch (Exception e) {
            answer = true;
        }

        return answer;
    }

    public String getText(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }
}
