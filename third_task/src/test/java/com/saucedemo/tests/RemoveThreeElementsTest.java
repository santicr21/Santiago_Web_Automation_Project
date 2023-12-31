package com.saucedemo.tests;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveThreeElementsTest extends BaseTest {
    @Test
    public void testIfCartIsEmptyAfterRemoveProducts () {
        System.out.println(homePage);
        homePage.addProductsToCart();
        CartPage cartPage = homePage.goToCartPage();
        cartPage.removeCartElements();
        Assert.assertTrue(cartPage.cartIsEmpty());
        System.out.println(homePage);
        homePage = cartPage.goToHomePage();
    }
}
