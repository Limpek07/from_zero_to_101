package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.zeroone.driver.Driver.getChromeDriver;

/**
 * For data, fields, methods that reoccur regularly in step definition classes.
 *
 * @author Zoltan_Limpek
 */
class BaseStepDefinition {
    ChromeDriver driver = getChromeDriver();
}
