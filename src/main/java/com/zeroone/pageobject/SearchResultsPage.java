package com.zeroone.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.zeroone.util.WebElementAssertions.elementHasAttributeEqualsTo;
import static com.zeroone.util.WebElementAssertions.elementHasText;
import static com.zeroone.util.WebElementAssertions.listHasSizeOf;
import static com.zeroone.util.WebElementHandler.waitForElementToBeVisible;

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

    private WebElement linkOfCourseNumber(int courseIndex) {
        return courses.get(courseIndex - 1).findElement(link);
    }

    private WebElement titleOfCourseNumber(int courseIndex) {
        return courses.get(courseIndex - 1).findElement(title);
    }

    public void waitForSearchHeaderContainerToBeVisible() {
        waitForElementToBeVisible("search header container", driver, searchHeaderContainer);
    }

    public void validateLinkUrlOfCourseNumber(int courseIndex, String expectedUrl) {
        elementHasAttributeEqualsTo(expectedUrl, linkOfCourseNumber(courseIndex), "href", "course link");
    }

    public void validateNumberOfCourses(int expectedNumberOfCourses) {
        listHasSizeOf(expectedNumberOfCourses, courses, "course list");
    }

    public void validateTitleOfCourseNumber(int courseIndex, String expectedCourseTitle) {
        elementHasText(titleOfCourseNumber(courseIndex), expectedCourseTitle, "course title");
    }

    public SearchResultsPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
