package com.zeroone.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.zeroone.util.WebElementHandler.waitForElementToBeVisible;

public class CourseLandingPage {
    ChromeDriver driver;

    @FindBy(className = "clp-lead__title")
    private WebElement courseTitle;

    public void waitForCourseTitleToBeVisible() {
        waitForElementToBeVisible("course title", driver, courseTitle);
    }

    public CourseLandingPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
