package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (id = "user-name")
    private WebElement userNameInput;

    @FindBy (id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(className = "login_logo")
    private WebElement loginLogo;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage userSignIn(String username, String password) {
        type (userNameInput, username);
        type (passwordInput, password);
        click (loginButton);
        return new HomePage(getDriver());
    }

    public String getPageLogo() {
        return getText(loginLogo);
    }
}
