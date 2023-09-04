package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBackpackButton;

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement removeBikeLightButton;

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement removeTShirtButton;

    @FindBy(className = "cart_item")
    WebElement cartList;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "postal-code")
    WebElement postalCodeInput;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "finish")
    WebElement finishButton;

    @FindBy(className = "complete-header")
    WebElement successMessage;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void removeCartElements() {
        click (removeBackpackButton);
        click (removeBikeLightButton);
        click (removeTShirtButton);
    }

    public void payCartProducts() {
        click (checkoutButton);
        type (firstNameInput, "Pepe");
        type (lastNameInput, "Jaramillo");
        type (postalCodeInput, "123456");
        click (continueButton);
        click (finishButton);
    }

    public String getSuccessMessage() {
        return getText(successMessage);
    }

    public boolean cartIsEmpty() {
        return !IsElementVisible (cartList);
    }


}
