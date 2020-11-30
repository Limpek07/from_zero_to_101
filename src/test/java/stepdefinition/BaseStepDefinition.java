package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.zeroone.driver.Driver.getChromeDriver;

/**
 * For data, fields, methods that reoccur regularly in step definition classes.
 *
 * @author Zoltan_Limpek
 */
class BaseStepDefinition {
    static final String BASE_URL = "https://www.udemy.com";
    ChromeDriver driver = getChromeDriver();
}
