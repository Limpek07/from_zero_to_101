package stepdefinition;

import com.zeroone.pageobject.CourseLandingPage;
import cucumber.api.java.en.Then;

public class CourseLandingPageStep extends BaseStepDefinition {

    @Then("I should be redirected to the course landing page")
    public void i_should_be_redirected_to_the_course_landing_page() {
        new CourseLandingPage(driver).waitForCourseTitleToBeVisible();
    }
}
