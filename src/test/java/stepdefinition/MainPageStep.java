package stepdefinition;

import com.zeroone.pageobject.MainPage;
import cucumber.api.java.en.And;

/**
 * Main page related step definitions.
 *
 * @author Zoltan_Limpek
 */
public class MainPageStep extends BaseStepDefinition {

    @And("I close the cookie policy overlay")
    public void i_close_the_cookie_policy_overlay() {
        MainPage mainPage = new MainPage(driver);

        mainPage.waitForCookiePolicyOverlayButton();
        mainPage.clickOnCookiePolicyOverlayButton();
    }

    @And("I search for {string} courses")
    public void i_search_for_x_courses(String searchTarget) {
        MainPage mainPage = new MainPage(driver);

        mainPage.fillHeaderSearchFieldWith(searchTarget);
        mainPage.clickOnHeaderSearchButton();
    }
}
