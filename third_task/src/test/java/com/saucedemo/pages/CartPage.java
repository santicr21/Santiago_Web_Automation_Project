package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeBackpackButton;

    @FindBy(id = "remove-sauce-labs-bike-light")
    private WebElement removeBikeLightButton;

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    private WebElement removeTShirtButton;

    @FindBy(className = "cart_item")
    private WebElement cartList;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(className = "complete-header")
    private WebElement successMessage;

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
