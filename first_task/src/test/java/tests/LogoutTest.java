package tests;

import com.beust.jcommander.internal.Console;
import org.testng.annotations.*;

import java.util.logging.*;

public class LogoutTest {
    private static final Logger logger = Logger.getLogger(LogoutTest.class.getName());

    @BeforeSuite
    public void setUp (){
        logger.setLevel(Level.INFO);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);

        logger.info("User has an account");
    }

    @BeforeClass
    public void userLoggingIn () {
        logger.info("User goes to https://www.saucedemo.com/");
        logger.info("User clicks on Username input");
        logger.info("User enter a correct username on the username input");
        logger.info("User clicks on password input");
        logger.info("User enter a the password related with the username on the password input");
        logger.info("User clicks on login button");
    }

    @Test
    public void logoutTest () {
        logger.info("User clicks on the navbar");
        logger.info("User clicks on Logout");
        logger.info("ASSERT User is on the login page");
    }

    @AfterClass
    public void userIsNotLogged () {
        logger.info("User must not be logged in");
    }

    @AfterSuite
    public void tearDown () {
        logger.info("User stills in db");
    }

}
