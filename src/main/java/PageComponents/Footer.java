package PageComponents;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer extends AbstractComponent {

    By linkTextWomen = By.linkText("Women");

    public Footer(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    public WebElement getLinkTextWomen() {
        return findElement(linkTextWomen);
    }
}
