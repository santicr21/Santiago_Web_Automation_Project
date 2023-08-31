package tests;

import com.beust.jcommander.internal.Console;
import org.testng.annotations.*;

import java.util.logging.*;

public class PurchaseProductTest {
    private static final Logger logger = Logger.getLogger(LogoutTest.class.getName());

    @BeforeSuite
    public void setUp (){
        logger.setLevel(Level.INFO);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);

        logger.info("User has an account");
        logger.info("There is at least 1 product in sold");
    }

    @BeforeTest
    public void userLoggingIn () {
        logger.info("User goes to https://www.saucedemo.com/");
        logger.info("User clicks on Username input");
        logger.info("User enter a correct username on the username input");
        logger.info("User clicks on password input");
        logger.info("User enter a the password related with the username on the password input");
        logger.info("User clicks on login button");
    }

    @BeforeClass
    public void addProduct () {
        logger.info("User clicks on add to cart button of any product");
        logger.info("User clicks on the cart");
        logger.info("User clicks on the checkout button");
    }

    @Test
    public void userEnterHisInformation () {
        logger.info("User clicks on the first name input");
        logger.info("User enters his first name");
        logger.info("User clicks on the last name input");
        logger.info("User enters his last name");
        logger.info("User clicks on the zip/postal code input");
        logger.info("User enters his zip/postal code");
        logger.info("User clicks on Continue button");
        logger.info("User clicks on Finish button");
        logger.info("ASSERT Thank you for your order");
    }

    @AfterClass
    public void userIsNotLogged () {
        logger.info("Product must be subtracted by 1");
    }

    @AfterSuite
    public void tearDown () {
        logger.info("User must keep logged in");
    }

}
