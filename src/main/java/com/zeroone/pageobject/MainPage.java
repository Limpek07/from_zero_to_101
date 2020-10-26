package com.zeroone.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

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
        WebDriverWait waiter = new WebDriverWait(driver, 10);
        waiter.withTimeout(ofSeconds(5)).until(presenceOfElementLocated(legalNoticeCloseButton));
    }

    public void clickOnCookiePolicyOverlayButton() {
        closeCookiePolicyOverlayButton.click();
    }

    public void fillHeaderSearchFieldWith(String searchTarget) {
        headerSearchField.sendKeys(searchTarget);
    }

    public void clickOnHeaderSearchButton() {
        headerSearchButton.click();
    }

    public MainPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
