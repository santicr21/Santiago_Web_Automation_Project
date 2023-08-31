package tests;

import com.beust.jcommander.internal.Console;
import org.testng.annotations.*;

import java.util.logging.*;

public class RemoveThreeProducts {
    private static final Logger logger = Logger.getLogger(LogoutTest.class.getName());

    @BeforeSuite
    public void setUp (){
        logger.setLevel(Level.INFO);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);

        logger.info("User has an account");
        logger.info("There are at least, 3 products in sold");
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
    public void addThreeProducts () {
        logger.info("User clicks on add to cart button of any product");
        logger.info("User clicks on add to cart button of any product");
        logger.info("User clicks on add to cart button of any product");
        logger.info("User clicks on the cart");
    }

    @BeforeMethod

    @Test
    public void userEnterHisInformation () {
        logger.info("User clicks on Remove button of any product");
        logger.info("User clicks on Remove button of any product");
        logger.info("User clicks on Remove button of any product");
        logger.info("ASSERT user's cart is empty");
    }

    @AfterClass
    public void userIsNotLogged () {
        logger.info("Products that were added must be on the main page again");
    }

    @AfterSuite
    public void tearDown () {
        logger.info("User must keep logged in");
    }

}
