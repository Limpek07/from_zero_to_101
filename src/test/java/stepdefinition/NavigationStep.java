package stepdefinition;

import cucumber.api.java.en.When;

/**
 * Navigation related step definitions.
 *
 * @author Zoltan_Limpek
 */
public class NavigationStep extends BaseStepDefinition {

    @When("I navigate to {string} url")
    public void i_navigate_to_x_url(String url) {
        driver.navigate().to(url);
    }
}
