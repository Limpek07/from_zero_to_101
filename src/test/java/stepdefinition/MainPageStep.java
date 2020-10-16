package stepdefinition;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

/**
 * Main page related step definitions.
 *
 * @author Zoltan_Limpek
 */
public class MainPageStep extends BaseStepDefinition {

    @And("I close the cookie policy overlay")
    public void i_close_the_cookie_policy_overlay() {
        WebDriverWait waiter = new WebDriverWait(driver, 10);
        waiter.withTimeout(ofSeconds(5)).until(presenceOfElementLocated(By.className("legal-notice--close-btn--2BZfw")));

        WebElement closeCookiePolicyOverlayButton = driver.findElement(By.className("legal-notice--close-btn--2BZfw"));
        closeCookiePolicyOverlayButton.click();
    }
}
