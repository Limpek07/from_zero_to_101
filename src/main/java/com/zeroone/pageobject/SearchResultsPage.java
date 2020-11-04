package com.zeroone.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.zeroone.util.WebElementHandler.waitForElementToBeVisible;

/**
 * Page object for the Search Results page.
 *
 * @author Zoltan_Limpek
 */
public class SearchResultsPage {
    private ChromeDriver driver;

    @FindBy(css = "[class*='search--header-container']")
    private WebElement searchHeaderContainer;

    public void waitForSearchHeaderContainerToBeVisible() {
        waitForElementToBeVisible("search header container", driver, searchHeaderContainer);
    }

    public SearchResultsPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
