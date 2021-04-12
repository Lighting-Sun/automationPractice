package AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {

    WebElement sectionElement;
    WebDriver driver;

    public AbstractComponent(WebDriver driver, By sectionElement){
        this.driver = driver;
        this.sectionElement = driver.findElement(sectionElement);
    }

    //Creation of a custom find element method
    public WebElement findElement(By elementLocator){
        return sectionElement.findElement(elementLocator);
    }
    //Method used for multiple elements
    public List<WebElement> findElements(By elementsLocator){
        return sectionElement.findElements(elementsLocator);
    }

}
