package com.zeroone.util;

import com.zeroone.logging.Logger;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class WebElementAssertions {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    private WebElementAssertions() {
    }

    public static void elementHasAttributeEqualsTo(String expectedString, WebElement element, String attribute, String elementName) {
        LOGGER.info("Validating if the " + attribute + " attribute of the " + elementName + " is " + expectedString);
        String actualAttributeValue = element.getAttribute(attribute);
        assertThat(actualAttributeValue)
                .withFailMessage("The '" + attribute + "' attribute of the '" + elementName + "' should be '" + expectedString + "', but was '" + actualAttributeValue + "'.")
                .isEqualTo(expectedString);
    }

    public static void listHasSizeOf(int expectedSize, List<WebElement> list, String elementName) {
        LOGGER.info("Validating if the size of " + elementName + " is " + expectedSize + ".");
        int actualListSize = list.size();
        assertThat(actualListSize)
                .withFailMessage("The size of '" + elementName + "' should be '" + expectedSize + "', but was '" + actualListSize + "'.")
                .isEqualTo(expectedSize);
    }

    public static void elementHasText(WebElement element, String expectedText, String elementName) {
        LOGGER.info("Validating if the text of " + elementName + " is " + expectedText + ".");
        String actualText = element.getText();
        assertThat(actualText)
                .withFailMessage("The text of '" + elementName + "' should be '" + expectedText + "', but was '" + actualText + "'.")
                .isEqualTo(expectedText);

    }
}
