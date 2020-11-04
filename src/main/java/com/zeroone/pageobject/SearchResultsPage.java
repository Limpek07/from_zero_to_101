package com.zeroone.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.zeroone.util.WebElementHandler.waitForElementToBeVisible;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Page object for the Search Results page.
 *
 * @author Zoltan_Limpek
 */
public class SearchResultsPage {
    private ChromeDriver driver;

    private By link = By.tagName("a");
    private By title = By.cssSelector("[class*='course-card--course-title--']");

    @FindBy(css = "[class*='search--header-container']")
    private WebElement searchHeaderContainer;

    @FindBy(css = "[class*='course-list--container--'] [class*='popper--popper--']")
    private List<WebElement> courses;

    public void waitForSearchHeaderContainerToBeVisible() {
        waitForElementToBeVisible("search header container", driver, searchHeaderContainer);
    }

    public void validateFirstCourseLinkUrl(String expectedUrl) {
        assertThat(courses.get(0).findElement(link).getAttribute("href")).isEqualTo(expectedUrl);
    }

    public void validateNumberOfCourses(int expectedNumberOfCourses) {
        assertThat(courses.size()).isEqualTo(expectedNumberOfCourses);
    }

    public void validateSecondCourseTitle(String expectedCourseTitle) {
        assertThat(courses.get(1).findElement(title).getText()).isEqualTo(expectedCourseTitle);
    }

    public SearchResultsPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
