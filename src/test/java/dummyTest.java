import PageComponents.Footer;
import PageObjects.LandingPage;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.base;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class dummyTest extends base {

    //using the logger feature! :D
    public static Logger logger = LogManager.getLogger(base.class.getName());

    public WebDriver driver;
    LandingPage landingPage;

    @BeforeTest
    public void setUpDriver() throws IOException {
        this.driver = initializeDriver();
        landingPage = new LandingPage(driver);
        logger.info("Driver initialized");
    }

    @Test
    public void basePageNavigation () throws IOException {
        driver.get("http://automationpractice.com/index.php");
        logger.info("Navigating to the landing page");
        landingPage.getFooterNavigation().getLinkTextWomen().click();
        Assert.assertTrue(false);
    }

    @AfterTest
    public void quitDriver(){
        driver.quit();
    }

}
