package stepdefinition;

import com.zeroone.pageobject.SearchResultsPage;
import cucumber.api.java.en.And;
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

    @And("I should have {int} courses on the page")
    public void i_should_have_x_courses_on_the_page(int numberOfCourses) {
        new SearchResultsPage(driver).validateNumberOfCourses(numberOfCourses);
    }

    @And("the first course should point to {string} url")
    public void the_first_course_should_point_to_x_url(String url) {
        new SearchResultsPage(driver).validateFirstCourseLinkUrl(url);
    }

    @And("the title of the second course should be {string}")
    public void the_title_of_the_second_course_should_be_x(String courseTitle) {
        new SearchResultsPage(driver).validateSecondCourseTitle(courseTitle);
    }
}
