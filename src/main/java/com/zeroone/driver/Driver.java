package com.zeroone.driver;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ChromeDriver initialization class.
 * We do this here, so we don't have to reimplement it every time. Extending this class is required.
 *
 * @author Zoltan_Limpek
 */
public class Driver {

    /**
     * Returns a working ChromeDriver.
     *
     * @return the ChromedDiver
     */
    public static ChromeDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        return new ChromeDriver();
    }
}
