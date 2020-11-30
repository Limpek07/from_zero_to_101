package stepdefinition;

import com.zeroone.logging.Logger;
import com.zeroone.pagetype.PageType;
import cucumber.api.java.en.When;

/**
 * Navigation related step definitions.
 *
 * @author Zoltan_Limpek
 */
public class NavigationStep extends BaseStepDefinition {
    private static final Logger LOGGER = new Logger(NavigationStep.class);

    @When("I navigate to {pageType} page")
    public void i_navigate_to_x_page(PageType pageType) {
        String urlFragment = pageType.getUrlFragment();

        LOGGER.info("Navigating to " + BASE_URL + urlFragment + " url.");
        driver.navigate().to(BASE_URL + urlFragment);
    }

    @When("I navigate to {pageType} page looking for {string}")
    public void i_navigate_to_x_page_looking_for_y(PageType pageType, String searchTarget) {
        String urlFragment = pageType.getUrlFragment();

        LOGGER.info("Navigating to " + BASE_URL + urlFragment + " url, with " + searchTarget + "search target.");
        driver.navigate().to(BASE_URL + urlFragment + searchTarget);
    }
}
