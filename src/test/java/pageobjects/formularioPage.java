package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.frameworkBase;

public class formularioPage extends frameworkBase {

    @FindBy(name = "RESULT_TextField-1") private WebElement txt_nombre;
    @FindBy(name = "RESULT_TextField-2") private WebElement txt_apellido;
    @FindBy(name = "RESULT_TextField-3") private WebElement txt_telefono;
    @FindBy(name = "RESULT_TextField-4") private WebElement txt_pais;
    @FindBy(name = "RESULT_TextField-5") private WebElement txt_ciudad;
    @FindBy(name = "RESULT_TextField-6") private WebElement txt_email;
    @FindBy(xpath = "//*[text()='Male']") private WebElement rdb_masculino;
    @FindBy(name = "RESULT_RadioButton-8") private WebElement rdb_femenino;
    @FindBy(name = "RESULT_RadioButton-9") private WebElement cmb_tiempo;
    @FindBy(name = "RESULT_FileUpload-10") private WebElement txt_file;
    @FindBy(name = "Submit") private WebElement btn_submit;


    public formularioPage() {
        PageFactory.initElements(driver, this);
    }

    public void escribirNombre(String nombre){
        wait.until(ExpectedConditions.visibilityOf(txt_nombre));
        txt_nombre.sendKeys(nombre);
    }

    public void escribirApellido(String apellido){
        txt_apellido.sendKeys(apellido);
    }

    public void escribirTelefono(String telefono){
        txt_telefono.sendKeys(telefono);
    }

    public void escribirPais(String pais){
        txt_pais.sendKeys(pais);
    }

    public void escribirCiudad(String ciudad){
        txt_ciudad.sendKeys(ciudad);
    }

    public void escribirEmail(String email){
        txt_email.sendKeys(email);
    }

    public void seleccionarGenero(String genero){
        if (genero.toLowerCase().equals("masculino")){
            rdb_masculino.click();
        }else if (genero.toLowerCase().equals("femenino")){
            rdb_femenino.click();
        }
    }

    public void seleccionarDias(String dias){
        String[] dia = dias.split(",");
        for (int i = 0; i < dia.length ; i++){
            driver.findElement(By.xpath("//*[text()='"+dia[i]+"']")).click();
        }
    }

    public void seleccionarTiempo(String tiempo){
        new Select(cmb_tiempo).selectByVisibleText(tiempo);
    }

    public void ingresarArchivo(String archivo){
        txt_file.sendKeys(archivo);
    }

    public void iframe(){
        driver.switchTo().frame("frame-one1434677811");
    }

//    public void seleccionarMultiple(String opciones){
//        String[] multiple = opciones.split(",");
//        for (String selected : multiple){
//            new Select(lst_multiple).selectByValue(selected);
//            lst_multiple.sendKeys(Keys.CONTROL);
//        }
//    }

    public void clickSubmit(){
        btn_submit.click();
    }
}
