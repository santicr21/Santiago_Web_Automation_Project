package com.saucedemo.tests;

import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.HomePage;

public class LogoutTest extends BaseTest {
    @Test
    public void testLogoutUser() {
        String LOGIN_LOGO_TEXT = "Swag Labs";
        HomePage homePage = loginPage.userSignIn();
        LoginPage loginPageAfterLogout = homePage.logout();
        Assert.assertEquals(loginPageAfterLogout.getPageLogo(), LOGIN_LOGO_TEXT);
    }
}
