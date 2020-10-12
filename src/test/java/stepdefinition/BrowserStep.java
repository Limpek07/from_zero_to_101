package stepdefinition;

import cucumber.api.java.en.And;

/**
 * Browser related step definitions.
 *
 * @author Zoltan_Limpek
 */
public class BrowserStep extends BaseStepDefinition {

    @And("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
