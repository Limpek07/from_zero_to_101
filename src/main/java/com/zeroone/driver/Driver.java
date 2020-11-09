package com.zeroone.driver;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ChromeDriver initialization class.
 * We do this here, so we don't have to reimplement it every time. Extending this class is required.
 *
 * @author Zoltan_Limpek
 */
public class Driver {
    private static ChromeDriver driver;

    /**
     * Returns a working ChromeDriver.
     *
     * @return the ChromeDiver
     */
    public static ChromeDriver getChromeDriver() {
        return driver;
    }

    public static void initDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
