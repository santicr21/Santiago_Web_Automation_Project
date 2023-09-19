package com.saucedemo.tests;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyAProductTest extends BaseTest {
    @Test
    public void testUserBuysAProduct () {
        String SUCCESS_MESSAGE = "Thank you for your order!";
        System.out.println(homePage);
        homePage.addProductToCart();
        CartPage cartPage = homePage.goToCartPage();
        cartPage.payCartProducts();
        Assert.assertEquals(cartPage.getSuccessMessage(), SUCCESS_MESSAGE);
        homePage = cartPage.goToHomePage();
    }
}
