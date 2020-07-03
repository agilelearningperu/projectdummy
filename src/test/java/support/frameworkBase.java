package support;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.hooks;

import java.util.Set;

public class frameworkBase {
    public WebDriverWait wait;
    public WebDriver driver;

    public frameworkBase() {
        driver= hooks.driver;
        wait = new WebDriverWait(driver,40);
    }

    public void iframe(String identificador){
        driver.switchTo().frame(identificador);
    }

    public void aceptarAlerta(){
        driver.switchTo().alert().accept();
    }

    public void ventanaAbierta(){
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles){
            driver.switchTo().window(handle);
        }
    }

    public void ventanaInicial(){
        driver.close();
        driver.switchTo().window("");
    }
}
