package stepdefinition;

import com.zeroone.logging.Logger;
import cucumber.api.java.en.When;

/**
 * Navigation related step definitions.
 *
 * @author Zoltan_Limpek
 */
public class NavigationStep extends BaseStepDefinition {
    private static final Logger LOGGER = new Logger(NavigationStep.class);

    @When("I navigate to {string} url")
    public void i_navigate_to_x_url(String url) {
        LOGGER.info("Navigating to " + url + " url.");
        driver.navigate().to(url);
    }
}
