package com.zeroone.util;

import com.zeroone.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

/**
 * Utility class for WebElement related actions.
 *
 * @author Zoltan_Limpek
 */
public final class WebElementHandler {
    private static final Logger LOGGER = new Logger(WebElementHandler.class);
    private static final long DEFAULT_TIMEOUT = 10;
    private static final long WAIT_TIMEOUT = 5;

    private WebElementHandler() {
        // prevents instantiation
    }

    public static void waitForElementToBeVisible(String elementName, ChromeDriver driver, WebElement element) {
        LOGGER.info("Waiting for '" + elementName + "' to be visible.");
        WebDriverWait waiter = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        waiter.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(visibilityOf(element));
    }

    public static void waitForElementToBePresent(String elementName, ChromeDriver driver, By element) {
        LOGGER.info("Waiting for '" + elementName + "' to be present.");
        WebDriverWait waiter = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        waiter.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(presenceOfElementLocated(element));
    }

    public static void clickOn(String elementName, ChromeDriver driver, WebElement element) {
        LOGGER.info("Clicking on '" + elementName + "'.");
        WebDriverWait waiter = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        waiter.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(elementToBeClickable(element));
        element.click();
    }

    public static void mouseOver(String elementName, ChromeDriver driver, WebElement element) {
        LOGGER.info("Hovering mouse over " + elementName + ".");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public static void fill(String elementName, String text, WebElement element) {
        LOGGER.info("Filling '" + elementName + "' with '" + text + "' text.");
        element.sendKeys(text);
    }
}
