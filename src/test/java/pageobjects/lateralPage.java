package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.frameworkBase;

public class lateralPage extends frameworkBase {
    @FindBy(xpath = "//button[text()='Click Me']") private WebElement btn_alert;
    @FindBy(id = "demo") private WebElement lbl_mensaje;

    public lateralPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAlert(){
        wait.until(ExpectedConditions.elementToBeClickable(btn_alert));
        btn_alert.click();
    }

    public void validarMensaje(String mensaje){
        wait.until(ExpectedConditions.visibilityOf(lbl_mensaje));
        Assert.assertEquals(mensaje, lbl_mensaje.getText());
    }
}
