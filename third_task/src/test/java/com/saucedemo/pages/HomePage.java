package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class HomePage extends BasePage {
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartBikeLightButton;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBackpackButton;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addToCartTShirtButton;

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCartButton;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void addProductsToCart() {
        click (addToCartBikeLightButton);
        click (addToCartBackpackButton);
        click (addToCartTShirtButton);
    }

    public LoginPage logout() {
        click (menuButton);
        click (logoutButton);
        return new LoginPage(getDriver());
    }

    public void addProductToCart() {
        click (addToCartBackpackButton);
    }

    public CartPage goToCartPage() {
        click (shoppingCartButton);
        return new CartPage(getDriver());
    }
}
