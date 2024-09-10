package frontend.ordancesurvey.steps;

import frontend.ordancesurvey.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Homepage {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I click on cookie")
    public void iClickOnCookie() {
        new HomePage().clickOnCookie();
    }

    @And("I mouse hover on {string} and click")
    public void iMouseHoverOnAndClick(String arg0) {
        new HomePage().clickOnDataProducts();
    }
}
