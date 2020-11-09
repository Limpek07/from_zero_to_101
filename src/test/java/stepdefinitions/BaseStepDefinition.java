package stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.zeroone.driver.Driver.getChromeDriver;

public class BaseStepDefinition {
    ChromeDriver driver = getChromeDriver();
}
