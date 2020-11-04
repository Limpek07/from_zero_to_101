package com.zeroone.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.zeroone.util.WebElementHandler.clickOn;
import static com.zeroone.util.WebElementHandler.fill;
import static com.zeroone.util.WebElementHandler.waitForElementToBePresent;

/**
 * Page object for the Main page.
 *
 * @author Zoltan_Limpek
 */
public class MainPage {
    private ChromeDriver driver;

    private By legalNoticeCloseButton = By.className("legal-notice--close-btn--2BZfw");

    @FindBy(css = "[class*='header--search-bar--'] button")
    private WebElement headerSearchButton;

    @FindBy(css = "[id*='-search-form-autocomplete--3']")
    private WebElement headerSearchField;

    @FindBy(className = "legal-notice--close-btn--2BZfw")
    private WebElement closeCookiePolicyOverlayButton;

    public void waitForCookiePolicyOverlayButton() {
        waitForElementToBePresent("legal notice close button", driver, legalNoticeCloseButton);
    }

    public void clickOnCookiePolicyOverlayButton() {
        clickOn("close cookie policy overlay button", driver, closeCookiePolicyOverlayButton);
    }

    public void fillHeaderSearchFieldWith(String searchTarget) {
        fill("header search field", searchTarget, headerSearchField);
    }

    public void clickOnHeaderSearchButton() {
        clickOn("header search button", driver, headerSearchButton);
    }

    public MainPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
