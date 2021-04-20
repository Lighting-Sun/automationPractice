package stepDefinitions;

import PageComponents.Footer;
import PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.base;

import java.io.IOException;

public class StepDefinition extends base {

    WebDriver driver;

    @Given("the user goes to {string}")
    public void theUserGoesTo(String url) throws IOException {
        driver = initializeDriver();
        driver.get(url);

    }

    @When("the user access to the {string} section")
    public void theUserAccessToTheSection(String sectionName) {
        LandingPage landingPage = new LandingPage(driver);
        Footer footer = landingPage.getFooterNavigation();
        footer.getLinkTextWomen().click();
    }

    @Then("the page will load the women section")
    public void thePageWillLoadTheWomenSection() {

    }
}
