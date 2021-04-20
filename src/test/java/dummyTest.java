import PageComponents.Footer;
import PageObjects.LandingPage;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import utils.base;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class dummyTest extends base {

    //using the logger feature! :D
    public static Logger logger = LogManager.getLogger(base.class.getName());

    public WebDriver driver;
    LandingPage landingPage;

}
