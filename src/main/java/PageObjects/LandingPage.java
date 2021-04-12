package PageObjects;

import PageComponents.Footer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.base;


import java.io.IOException;

public class LandingPage {

    WebDriver driver;

    By footerSection = By.xpath("//div[@class='footer-container']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public Footer getFooterNavigation(){ return new Footer(driver,footerSection); }

}
