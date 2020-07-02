package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.hooks;

public class frameworkBase {
    public WebDriverWait wait;
    public WebDriver driver;

    public frameworkBase() {
        driver= hooks.driver;
        wait = new WebDriverWait(driver,40);
    }
}
