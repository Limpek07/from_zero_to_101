package stepdefinition;

import com.zeroone.pageobject.SearchResultsPage;
import cucumber.api.java.en.Then;

/**
 * Search result page related step definitions.
 *
 * @author Zoltan_Limpek
 */
public class SearchResultsStep extends BaseStepDefinition {

    @Then("I should be redirected to the search results page")
    public void i_should_be_redirected_to_the_search_results_page() {
        new SearchResultsPage(driver).waitForSearchHeaderContainerToBeVisible();
    }
}
